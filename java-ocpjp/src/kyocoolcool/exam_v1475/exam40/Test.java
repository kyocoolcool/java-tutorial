package kyocoolcool.exam_v1475.exam40;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 3:35 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.stream().map(s -> s * 2).peek(System.out::println).count();
    }
}
