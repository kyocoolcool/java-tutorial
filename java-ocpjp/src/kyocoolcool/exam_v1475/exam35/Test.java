package kyocoolcool.exam_v1475.exam35;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 2:59 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("", "George", "", "John", "Jim");
        final long count = strings.stream().filter(s -> !s.isEmpty()).count();
        System.out.println(count);
    }
}
