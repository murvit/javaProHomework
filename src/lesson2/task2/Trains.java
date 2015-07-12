package lesson2.task2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * ���� ������ �������, �������������� � ���� XML. ������� �� ����� ���������� � ��� �������, �������
 * ������������ ������� � 15:00 �� 19:00.
 * �������� ��� ��� ���������� ����� ������� � ������������ XML.
 */

@XmlRootElement(name = "trains")
public class Trains {

    @XmlElement(name = "train")
    public List<Train> trains;

    public void addTrain(Train train) {
        for (Train tr : trains) {
            if (tr.id == train.id) {
                System.out.println("Train is already here");
                return;
            }
        }
        trains.add(train);
        System.out.println("Added OK");
    }

    public Trains() {
    }
}
