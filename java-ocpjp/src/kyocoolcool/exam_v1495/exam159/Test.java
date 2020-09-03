package kyocoolcool.exam_v1495.exam159;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 11:00 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Java", "Java ME", "Java EE");
//        final boolean result = strings.stream().findAny().get().equals("Java");
//        final boolean result = strings.stream().anyMatch(s->s.equals("Java"));
//        final boolean result = strings.stream().findFirst().get().equals("Java");
        final boolean result = strings.stream().allMatch(s -> s.equals("Java"));
        System.out.println(result);
    }
}
