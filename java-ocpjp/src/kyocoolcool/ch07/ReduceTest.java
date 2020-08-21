package kyocoolcool.ch07;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ReduceTest
 * @description
 * @date 2020/7/31 2:40 PM
 **/

public class ReduceTest {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("w", "o", "l", "f");
        final String x = strings.parallelStream().reduce("X", (a, b) -> a + b);
        System.out.println(x);
    }
}
