package kyocoolcool.exam.exam82;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 4:00 PM
 **/
final class Folder implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("close");
    }

    public void open() {
        System.out.print("Open");
    }
}

public class Test {
    public static void main(String[] args) {
        try (Folder f = new Folder()) {
            f.open();
        }
    }
}
