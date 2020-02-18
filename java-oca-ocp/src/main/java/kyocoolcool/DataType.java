package kyocoolcool;

/**
 * @ClassName DataType
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/14 5:23 PM
 * @Version 1.0
 **/

public class DataType {
    public static void main(String[] args) {
        Integer x = 14;
        Float y = 13.2F;
        Double z = 30.5;
        Long k = 10L;
        Double v = x * y / z * k;
        System.out.println(v);
        short a = (short) 1921222;
        System.out.println(a);

        short g = 10;
        short f = 3;
        final short i = (short) ( g * f);
        System.out.println(i);
        System.out.println(Integer.MIN_VALUE-1);
    }
}