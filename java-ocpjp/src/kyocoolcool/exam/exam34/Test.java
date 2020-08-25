package kyocoolcool.exam.exam34;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 2:04 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("why ", "what ", "when ");
        final BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2);
        final String sen = strings.stream().reduce("Word: ", operator);
        System.out.println(sen);
    }
}
