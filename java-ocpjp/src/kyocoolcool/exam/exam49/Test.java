package kyocoolcool.exam.exam49;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 6:23 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.stream()
                .map(n -> n * 2)
                .peek(System.out::println)
                .count();
    }
}
