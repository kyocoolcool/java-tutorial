package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className OuterTest
 * @description
 * @date 2020/6/19 5:20 PM
 **/

public class OuterTest {
    public static void main(String[] args) {
        final Outer outer = new Outer();
        final Outer.Inner inner = outer.new Inner();
//        inner.countDown();
        System.out.println(inner.count);
    }
}
