package kyocoolcool.exam_v1495.exam138;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 2:39 PM
 **/

interface CourseFilter extends Predicate<String> {
    public default boolean test(String str) {
        return str.equals("Java");
    }
}

public class Test {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
        Predicate<String> cf1 = s -> s.length() > 3;
        Predicate cf2 = new CourseFilter() { //line n1
            public boolean test(String s) {
                return s.contains("Java");
            }
        };
        long c = strs.stream()
                .filter(cf1)
                .filter(cf2)//line n2
                .count();
        System.out.println(c);
    }
}
