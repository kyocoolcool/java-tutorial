package kyocoolcool.exam.exam83;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 4:04 PM
 **/
public class Test implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close- ");
    }

    public void open() {
        System.out.println("open-");
    }

    public static void main(String[] args) throws Exception {
        Test test = new Test();
        try {
            test.open();
            test.close();
        } catch (Exception e) {
            System.out.println("exception -1");
        }
        try (Test test2 = new Test()) {
            test.open();
        }
//        catch (Exception e) {
//            System.out.println("exception -2");
//        }

    }
}
