package kyocoolcool.exam_v1495.exam97;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 6:23 PM
 **/
public class Test {
    public static void main(String[] args) {
        final IntStream intStream = IntStream.of(1, 2, 3, 4);
        final Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0, 4.0);
//        final Stream<Integer> doubleStream = Stream.of(1, 2, 3, 4);
        final DoubleStream st = DoubleStream.of(1.0, 2.0, 3.0, 4.0);
        final double asDouble = intStream.average().getAsDouble();
        System.out.println(asDouble);

    }
}
