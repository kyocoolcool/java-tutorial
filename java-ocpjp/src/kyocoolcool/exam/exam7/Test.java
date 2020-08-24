package kyocoolcool.exam.exam7;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 5:25 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("", "aaa", "", "bbb", "ccc");
        final Long count = strings.stream()
                .filter(x -> !x.isEmpty())
                .count();
        System.out.println(count);
    }
}
