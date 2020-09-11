package kyocoolcool.exam_v1475.exam181;

import java.util.function.UnaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 2:05 PM
 **/
public class Test {
    public static void main(String[] args) {
        final String str1 = "Java";
         StringBuffer sbf = new StringBuffer("Course");
        UnaryOperator<String> u=(str2) -> str1.concat(str2);
        UnaryOperator<String> c=(str3) -> str3.toLowerCase();
        System.out.println(u.apply(c.apply(sbf.toString())));

    }
}
