package kyocoolcool.exam.exam37;

import java.util.Objects;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 2:53 PM
 **/
public class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        boolean output = false;
        Book b = (Book) o;
        if (this.name.equals(b.name)) {
            output = true;
        }
        return output;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        final Book b1 = new Book(101, "Java Programing");
        final Book b2 = new Book(102, "Java Programing");
        System.out.println(b1.equals(b2));
    }
}
