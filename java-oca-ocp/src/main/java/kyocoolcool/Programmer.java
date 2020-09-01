package kyocoolcool;

/**
 * @ClassName Programmer
 *
 * @Author Chris Chen
 * @Date 2019/11/7 10:41 PM
 * @Version 1.0
 **/

abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
    public static void read() {
        System.out.println("Author");
    }


}

class GoodAuthor extends Author{
    public static void read() {
        System.out.println("GoodAuthor");
    }

    public void ha() {
        System.out.println("haha");
    }
}
public class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();

        GoodAuthor author = new GoodAuthor();
        author.ha();
    }
}