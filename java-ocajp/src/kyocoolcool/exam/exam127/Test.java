package kyocoolcool.exam.exam127;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/20 3:57 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder(5);
        final StringBuilder stringBuilder2 = new StringBuilder(5);
        String a = "";
        System.out.println(stringBuilder.equals(a));
        System.out.println(stringBuilder.toString().equals(a));
        System.out.println(stringBuilder.equals(stringBuilder2));
        System.out.println(stringBuilder.equals(stringBuilder));

    }
}
