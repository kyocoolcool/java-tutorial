package kyocoolcool.ch04;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test03
 * @description
 * @date 2020/7/20 3:36 PM
 **/

public class Test03 {
    public static void main(String[] args) {
        final Predicate<String> preficate = s -> s.length() > 3;
        final Stream<String> stream = Stream.iterate("-", s -> s + s);
//        final boolean a = stream.noneMatch(preficate);
        final boolean b = stream.anyMatch(preficate);
//        System.out.println(a);
        System.out.println(b);

    }
}
