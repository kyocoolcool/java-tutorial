package ocajp.text;

import org.junit.Test;

/**
 * @ClassName DecimalFormat
 *
 * @Author Chris Chen
 * @Date 2019-06-28 09:26
 * @Version 1.0
 **/

public class DecimalFormat {

    @Test
    public void test() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat();
        int a = 95278888;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test2() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("####,####");
        int a = 95278888;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test3() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("####,####.##");
        double a = 95278888.23567;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test4() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("####,####,####,####.##");
        double a = 95278888.23567;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test5() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0000,0000,0000");
        int a = 95278888;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test6() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0000,0000,0000");
        Integer a = 95278888;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test7() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0000,0000,0000.0000000");
        Double a = 95278888.778912;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }

    @Test
    public void test8() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat(".##%");
        Double a = 0.12567;
        String format = decimalFormat.format(a);
        System.out.println(format);
    }
}