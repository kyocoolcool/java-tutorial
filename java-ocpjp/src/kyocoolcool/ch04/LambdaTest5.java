package kyocoolcool.ch04;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest5
 * @description
 * @date 2020/7/17 2:49 PM
 **/

public class LambdaTest5 {
    public static void main(String[] args) {
//        final Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
//        iterate.limit(5).filter(x->x%2==1).forEach(System.out::println);
        final Stream<String> integerStream = Stream.of("1", "2", "3");
        final Optional<String> reduce = integerStream.reduce((a, b) -> a + b);
        final Optional<Integer> integer = reduce.map((String::length));
        integer.ifPresent(System.out::print);
    }
}
