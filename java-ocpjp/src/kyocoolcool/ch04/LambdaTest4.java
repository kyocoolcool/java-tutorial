package kyocoolcool.ch04;

import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest4
 * @description
 * @date 2020/7/17 2:03 PM
 **/

public class LambdaTest4 {
    public static void main(String[] args) {
        final Stream<String> stream = Stream.of("aaaa", "bbbbbb");
//        stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
        stream.sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
    }
}
