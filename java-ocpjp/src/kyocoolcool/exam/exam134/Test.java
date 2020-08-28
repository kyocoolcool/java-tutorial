package kyocoolcool.exam.exam134;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 11:51 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Jim", "Johnny", "Jeff");
        Function<String, String> function = s -> "Hello:".concat(s);
        final Optional<String> max = strings.stream().map(function).peek(System.out::println).max(Comparator.comparing(s -> s.length()));
        System.out.println("");
        System.out.println(max.get());
    }
}
