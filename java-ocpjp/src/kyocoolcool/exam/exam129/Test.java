package kyocoolcool.exam.exam129;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 10:10 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(10, 20, 8);
//        final Integer integer = integers.stream().max(Comparator.comparing(a -> a)).get();
        final Integer integer = integers.stream().max(Integer::compare).get();
        System.out.println(integer);
    }
}
