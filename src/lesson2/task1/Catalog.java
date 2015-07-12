package lesson2.task1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Сделать возможность искать значения в случае дублирования имен тэгов.
 * 2. Реализовать обработку тэгов типа <tag />
 */

@XmlRootElement(name="catalog")
public class Catalog {

    @XmlElement(name="book")
    private List<Book> books = new ArrayList<Book>();

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(books.toArray());
    }
}
