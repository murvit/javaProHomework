package lesson2.task2;

/**
 * Есть список поездов, представленный с виде XML. Вывести на экран информацию о тех поездах, которые
 * отправляются сегодня с 15:00 до 19:00.
 * Написать код для добавления новых поездов в существующий XML.
 */

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Trains trains = parser.load();
        parser.filter(trains, "19.12.2013 15:00", "19.12.2013 19:00");
        Train train = new Train(3, "Kiev", "Odessa", "19.12.2013", "16:45");
        trains.addTrain(train);
        parser.save(trains);
    }
}
