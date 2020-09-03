package kyocoolcool.exam_v1495.exam93;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 5:46 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
        Predicate<String> test1 = w -> {
            System.out.println("checking...");
            return w.equals("do");
        };
        Predicate<String> test2 = (String w) -> w.length() > 3;
        words.stream().filter(test2).filter(test1).count();
    }
}
