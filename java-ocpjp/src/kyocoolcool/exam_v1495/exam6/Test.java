package kyocoolcool.exam_v1495.exam6;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 4:59 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("100,Robin,HR", "200,Mary,Admin Service", "101,Peter,HR");
        strings.stream().filter(x->x.toLowerCase().contains("r")).sorted().forEach(System.out::println);
    }
}
