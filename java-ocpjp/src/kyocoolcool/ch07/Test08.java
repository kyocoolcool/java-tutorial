package kyocoolcool.ch07;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test04
 * @description
 * @date 2020/8/3 9:24 AM
 **/

public class Test08 {
    public static void main(String[] args) {
        final Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        final Integer integer = integerStream.findAny().get();
        System.out.println(integer);
        synchronized (integer) {
            final Integer integer1 = Arrays.asList(6, 7, 8, 9).parallelStream().sorted().findAny().get();
            System.out.println(integer1);
        }

    }
}
