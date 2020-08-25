package kyocoolcool.exam.exam38;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 3:00 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> nl = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello:".concat(s);
        nl.stream().map(funVal).forEach(s->System.out.println(s));
    }
}
