package kyocoolcool.exam.exam139;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 2:44 PM
 **/

class ImageScanner implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("Scanner closed.");
    }

    public void scanImage() throws Exception {
        System.out.print("Scan.");
        throw new Exception("Unable to scan.");
    }
}


class ImagePrinter implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("Printer closed.");
    }

    public void printImage() {
        System.out.print("Print.");
    }
}

public class Test {

    public static void main(String[] args) {
        try (ImageScanner ir = new ImageScanner();
             ImagePrinter iw = new ImagePrinter()) {
            ir.scanImage();
            iw.printImage();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
