package kyocoolcool.exam.exam145;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 4:56 PM
 **/
public class Test {
    public static void main(String[] args) {
        BiPredicate<String, String> bp = (String a,String b) -> a.contains("SG") && b.contains("Java");
        BiFunction<String, String, Integer> bf = (String s1, String s2) -> {
            int fee = 0;
            if (bp.test(s1, s2)) {
                fee = 100;
            }
            return fee;
        };
        final Integer feel = bf.apply("D101SG", "Java Programing");
        System.out.println(feel);
    }
}
