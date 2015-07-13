package lesson2.task2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Есть список поездов, представленный с виде XML. Вывести на экран информацию о тех поездах, которые
 * отправляются сегодня с 15:00 до 19:00.
 * Написать код для добавления новых поездов в существующий XML.
 */

public class Parser {
    JAXBContext jaxbContext;
    File file = new File("src\\res\\Trains.xml");

    public Parser() {
        try {
            jaxbContext = JAXBContext.newInstance(Trains.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Trains load() {
        Trains trains = null;
        try {
            Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains) unMarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return trains;
    }

    public void filter(Trains trains, String from, String to) {
        SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        Date dateFrom = null;
        try {
            dateFrom = sf.parse(from);
            Date dateTo = sf.parse(to);
            for (Train train : trains.trains) {
                Date dateDeparture = sf.parse(train.date + " " + train.departure);
                if (dateDeparture.after(dateFrom) && dateDeparture.before(dateTo)) {
                    System.out.println(train);
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void save(Trains trains) {
        try {
            jaxbContext = JAXBContext.newInstance(Trains.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(trains, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
