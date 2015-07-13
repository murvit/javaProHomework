package lesson2.task2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * ���� ������ �������, �������������� � ���� XML. ������� �� ����� ���������� � ��� �������, �������
 * ������������ ������� � 15:00 �� 19:00.
 * �������� ��� ��� ���������� ����� ������� � ������������ XML.
 */

@XmlRootElement(name = "train")
public class Train {
    @XmlAttribute
    int id;

    @XmlElement
    String from;

    @XmlElement
    String to;

    @XmlElement
    String date;

    @XmlElement
    String departure;

    public Train() {
    }

    public Train(int id, String from, String to, String date, String departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
            }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
