package kyocoolcool.exam_v1495.exam132;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 11:44 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("SE", "EE");
        final String java = strings.parallelStream().reduce("Java", (a, b) -> a.concat(b));
        System.out.println(java);
    }
}
