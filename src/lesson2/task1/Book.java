package lesson2.task1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * 1. Сделать возможность искать значения в случае дублирования имен тэгов.
 * 2. Реализовать обработку тэгов типа <tag />
 */

@XmlRootElement(name = "book")
public class Book {

    private String author;
    private String title;
    private String genre;
    private double price;
    private Date publishDate;

    public Book() {
    }

    public Book(String author, String title, String genre, double price, Date publishDate) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                '}';
    }

    public Date getPublishDate() {
        return publishDate;
    }

    @XmlElement(name = "publish_date")
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    @XmlElement
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    @XmlElement
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
