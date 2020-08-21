package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test21
 * @description
 * @date 2020/6/21 11:19 AM
 **/

public class Test21 {
    public Test21(String x) {
        this.x = x;
    }

    public String x = "hello";
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void test() {
        System.out.println(x);
    }
}

class Test21_21 extends Test21{
    public Test21_21(String x) {
        super(x);
        this.x = x;
    }

    public String x = "good";

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    //    @Override
//    public void test() {
//        System.out.println(x);
//    }

    public static void main(String[] args) {
        Test21 test21 = new Test21_21("bbbb");
//        test21.test();
        test21.setX("aaaa");
        System.out.println(((Test21_21)test21).x);
    }
}
