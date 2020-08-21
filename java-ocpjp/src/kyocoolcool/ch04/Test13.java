package kyocoolcool.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test13
 * @description
 * @date 2020/7/20 5:09 PM
 **/

public class Test13 {
    public static void main(String[] args) {
        final List<Integer> a = Arrays.asList(1, 2, 3);
        final List<Integer> b = Arrays.asList(4, 5, 6);
        final List<Integer> c = Arrays.asList();
        final Stream<List<Integer>> a1 = Stream.of(a, b, c);
        a1.flatMap(x->x.stream()).map(x->x+1).forEach(System.out::println);

    }
}
