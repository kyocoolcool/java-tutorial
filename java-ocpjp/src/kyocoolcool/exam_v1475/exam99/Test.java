package kyocoolcool.exam_v1475.exam99;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 5:19 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("What", "Why", "When");
        final BinaryOperator<String> biFunction = (String a, String b) -> a.concat(b);
        final String reduce = strings.stream().reduce("Word:", biFunction);
        System.out.println(reduce);
    }
}
