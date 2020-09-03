package kyocoolcool.exam_v1495.exam81;

import java.util.function.UnaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 3:53 PM
 **/
public class Test {
    public static void main(String[] args) {
        final String str1 = "Java";
        final StringBuffer strBuf = new StringBuffer("Course");
        UnaryOperator<String> u = str2 -> str1.concat(str2);
        UnaryOperator<String> c = str3 -> str3.toLowerCase();
        System.out.println(u.apply(c.apply(strBuf.toString())));

    }
}
