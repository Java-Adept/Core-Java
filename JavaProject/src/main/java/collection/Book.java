package collection;

import java.io.Serializable;

public class Book  implements Serializable {

    private static final long serialVersionUID = 1L;
    private int bookId;
    private String title;
    private String name;
    private double price;

    public Book(int bookId, String title, String name, double price) {
        this.bookId = bookId;
        this.title = title;
        this.name = name;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
