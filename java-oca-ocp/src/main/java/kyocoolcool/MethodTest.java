package kyocoolcool;

/**
 * @ClassName MethodTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/22 10:12 AM
 * @Version 1.0
 **/

public class MethodTest {
    private void hel() {
        System.out.println("hel");
    }

    private void hel2() {
        hel();
    }

    public static void main(String[] args) {
        final MethodTest methodTest = new MethodTest();
        methodTest.hel2();
    }
}