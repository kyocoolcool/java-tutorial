package kyocoolcool;

/**
 * @ClassName ExceptionTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/11 10:29 PM
 * @Version 1.0
 **/

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("a");
        try {
            System.out.println("b");
            throw new ArithmeticException();
        } catch (RuntimeException e) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
        System.out.println("e");
    }
}