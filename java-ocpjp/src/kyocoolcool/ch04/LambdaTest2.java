package kyocoolcool.ch04;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest2
 * @description
 * @date 2020/7/16 2:02 PM
 **/

public class LambdaTest2 {
    public static void main(String[] args) {
        final Optional<String> a = Optional.ofNullable("aaaa");
        System.out.println(a);
        final Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println(integerStream.count());
        final Stream<String> st = Stream.generate(()->"hello").limit(4);
        System.out.println(st.count());
    }
}
