package lesson2.task4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "rate")
public class Rate {
    @XmlAttribute
    public String id;
    @XmlElement (name = "Name")
    public String name;
    @XmlElement (name = "Rate")
    public double rate;
    @XmlElement (name = "Date")
    public String date;
    @XmlElement (name = "Time")
    public String time;
    @XmlElement (name = "Ask")
    public String ask;
    @XmlElement (name = "Bid")
    public String bid;

    public Rate() {
    }

    public Rate(String id, String name, double rate, String date, String time, String ask, String bid) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.date = date;
        this.time = time;
        this.ask = ask;
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Rate=" + rate +
                ", Date='" + date + '\'' +
                ", Time='" + time + '\'' +
                ", Ask='" + ask + '\'' +
                ", Bid='" + bid + '\'' +
                '}';
    }
}
