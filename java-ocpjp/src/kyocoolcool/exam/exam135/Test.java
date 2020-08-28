package kyocoolcool.exam.exam135;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 2:20 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(3, 5, 7, 9);
        final Stream<Integer> integerStream = integers.stream().filter(x -> x > 5);
        final List<Integer> collect = integers.stream().collect(Collectors.toList());
        final long count = integers.stream().count();
        final Stream<Integer> distinct = integers.stream().distinct();
        final Stream<Integer> peek = integers.stream().peek(System.out::println);;

    }
}
