package kyocoolcool.exam_v1495.exam53;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 7:02 PM
 **/
public class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        boolean output = false;
        Book book = (Book) o;
        if (this.id == book.id) {
            output = true;
        }
        return output;
    }

    public static void main(String[] args) {
        final Book b1 = new Book(101, "Java Programing");
        final Book b2 = new Book(102, "Java Programing");
        System.out.println(b1.equals(b2));
    }
}
