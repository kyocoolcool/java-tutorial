package kyocoolcool.exam_v1475.exam9;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 3:36 PM
 **/
public class Test {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Duke");
        String s1 = sb.toString();
//        String s2 = s1;
        System.out.println(s1);
        String s2 = "Duke";
        System.out.println(s2==s1);

    }
}
