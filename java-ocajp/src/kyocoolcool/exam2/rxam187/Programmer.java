package kyocoolcool.exam2.rxam187;

/**
 * @ClassName Programmer
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 4:35 PM
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
}
public class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
        final StringBuilder stringBuilder = new StringBuilder("Java");
        String a = "Love";
        stringBuilder.append(a);
        final String substring = stringBuilder.substring(4);
        System.out.println(stringBuilder);
        System.out.println(substring);
        System.out.println("------");
        final int i = stringBuilder.indexOf(a);
        System.out.println(i);
        System.out.println(substring.indexOf(a));


    }
}
