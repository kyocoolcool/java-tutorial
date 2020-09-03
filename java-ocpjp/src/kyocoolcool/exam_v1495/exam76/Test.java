package kyocoolcool.exam_v1495.exam76;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 3:36 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(10, 20, 30);
        Function<Integer, Integer> function = x -> x + x;
        Consumer<Integer> consumer = x -> System.out.println("val:" + x);
        integers.stream().map(function).forEach(consumer);
    }
}
