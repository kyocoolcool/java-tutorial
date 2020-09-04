package kyocoolcool.exam_v1475.exam4;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 2:21 PM
 **/
public class Test {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder(5);
        sb.append("1234567");
        System.out.println(sb.length());
        System.out.println(sb.toString());
        String s = "";
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No match");
        }
    }
}
