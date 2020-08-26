package kyocoolcool.exam.exam68;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 2:17 PM
 **/
public class Book implements Comparator<Book> {
    String name;
    double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        final List<Book> books = Arrays.asList(new Book("Beginming with Java", 2),
                new Book("A Guid To Java Tour", 3)
        );

        System.out.println(books);

        Collections.sort(books,new Book());
        System.out.println(books);
    }
}
