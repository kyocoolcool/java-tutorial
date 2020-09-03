package kyocoolcool.exam_v1495.exam160;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 11:07 AM
 **/
public class Test {
    public static void main(String[] args) {
        List<String> str = Arrays.asList ("my", "pen", "is", "your","pen","pen");
                Predicate<String> test = s -> {
                    int i = 0;
                    boolean result = s.contains ("pen");
                      System.out.print((i++)+":");
                    return result;
                };
        str.stream()
                .filter(test)
//                .findFirst()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::print);
    }
}
