package kyocoolcool.exam_v1495.exam86;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 4:53 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Java", "J2EE", "J2ME", "JSTL", "JSP", "Oracle DB");
        Predicate<String> predicate = x -> x.contains("J");
        final List<String> collect = strings.stream().filter(x -> x.length() > 3).filter(predicate).collect(Collectors.toList());
        System.out.println(collect);
    }
}
