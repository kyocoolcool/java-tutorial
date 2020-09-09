package kyocoolcool.exam_v1475.exam74;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 11:29 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("EE", "SE");
        final String java = strings.parallelStream().reduce("Java", (a, b) -> a.concat(b));
        System.out.println(java);
    }
}
