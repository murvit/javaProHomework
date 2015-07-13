package lesson2.task4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement (name = "query")
public class Query {

    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public int count;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public String created;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public String lang;

    @XmlElementWrapper(name = "results")
    @XmlElement(name = "rate")
    public List<Rate> rate;

    public Query() {
    }

    public Query(int count, String created, String lang, List<Rate> rate) {
        this.count = count;
        this.created = created;
        this.rate = rate;
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", rate=" + rate +
                '}';
    }
}
