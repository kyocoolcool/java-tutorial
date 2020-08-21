package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test20
 * @description
 * @date 2020/6/21 11:17 AM
 **/

public class Test20 {
    String x = "nice";
    static class Hi extends Test20{
        String x = "good";
    }

    public static void main(String[] args) {
        Test20 test20 = new Hi();
        Hi hi = new Hi();
        System.out.println(test20.x);
        System.out.println(hi.x);

    }
}
