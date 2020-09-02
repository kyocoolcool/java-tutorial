package kyocoolcool.exam2.exam50;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/21 5:11 PM
 * @Version 1.0
 **/

public class Test {
    static double area;
    int b=2, h = 3;
    public static void main(String[] args) {
        double p, b, h;
        if (area == 0) {
            b=3;
            h=4;
            p = 0.5;
            area = b * p * h;
        }
        System.out.println(area);
    }
}
