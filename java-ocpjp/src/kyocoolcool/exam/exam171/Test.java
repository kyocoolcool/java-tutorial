package kyocoolcool.exam.exam171;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 02:35
 **/
public class Test {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching...");
            return n.contains("red");
        };
        colors.stream()
                .filter(c -> c.length() > 3)
                .allMatch(test);
    }
}