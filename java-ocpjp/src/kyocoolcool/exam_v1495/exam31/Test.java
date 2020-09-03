package kyocoolcool.exam_v1495.exam31;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 11:28 AM
 **/
public class Test {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Java EE", "Embedded Java");
        Predicate<String> cf1 = s -> s.length() > 3;
        Predicate cf2 = new CourseFilter() { //line n1
            public boolean test(String s) {
                return s.startsWith("Java");
            }
        };
        long c = strs.stream()
                .filter(cf1)
                .filter(cf2)//line n2
                .count();
        System.out.println(c);
    }
}
