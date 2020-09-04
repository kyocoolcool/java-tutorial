package kyocoolcool.exam_v1475.exam1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 2:01 PM
 **/
public class Test {
    public static void main(String[] args) {
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello : ".concat(s);
        nL.stream().map(funVal).peek(System.out::print);
    }
}
