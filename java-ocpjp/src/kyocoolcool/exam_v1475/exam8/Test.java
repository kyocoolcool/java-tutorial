package kyocoolcool.exam_v1475.exam8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 3:19 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> list = Arrays.asList("JAVA", "J2EE", "J2ME", "JSTL", "JSP", "Oracle DB");
        final Predicate<String> val = p -> p.contains("J");
        final List<String> newList = list.stream().filter(x -> x.length() > 3).filter(val).collect(Collectors.toList());
        System.out.println(newList);

    }
}
