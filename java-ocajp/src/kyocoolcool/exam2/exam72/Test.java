package kyocoolcool.exam2.exam72;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/23 10:28 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final float v = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        final float v1 = v + 1024;
        System.out.println(v1);
    }
}
