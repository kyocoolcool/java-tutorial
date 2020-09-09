package kyocoolcool.exam_v1475.exam98;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 5:13 PM
 **/
public class Test {
    static double area;
    int b = 2, h = 3;

    public static void main(String[] args) {
        double p, b, h;
        if (area == 0) {
            p = 3;
            b = 5;
            h = 0.5;
        } else {
            p = 4;
            b = 6;
            h = 0.6;
        }
        area = p * b * h;
        System.out.println(area);
    }
}
