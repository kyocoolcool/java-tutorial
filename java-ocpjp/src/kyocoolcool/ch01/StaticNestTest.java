package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className StaticNest
 * @description
 * @date 2020/6/20 2:57 PM
 **/

public class StaticNestTest {

    public static void main(String[] args) {
        final StaticNest.Inner inner = new StaticNest.Inner();
        System.out.println(inner.x);
    }
}
