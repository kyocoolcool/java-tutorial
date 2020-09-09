package kyocoolcool.exam_v1475.exam61;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 9:30 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Java", "Java EE", "Java SE");
        final boolean java = strings.stream().findAny().get().equals("Java");
        System.out.println(java);
    }
}
