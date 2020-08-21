package kyocoolcool.exam2.exam86;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/23 11:36 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        String s3 =String.valueOf(s1 + s2);
        Long s4 = (long) s1 + s2;
        System.out.println(s3);
        System.out.println("sum is"+s4);
    }
}
