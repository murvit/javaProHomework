package lesson2.task2;

/**
 * ���� ������ �������, �������������� � ���� XML. ������� �� ����� ���������� � ��� �������, �������
 * ������������ ������� � 15:00 �� 19:00.
 * �������� ��� ��� ���������� ����� ������� � ������������ XML.
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
