package kyocoolcool.ch04;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test14
 * @description
 * @date 2020/7/21 9:55 AM
 **/

public class Test14 {
    public static void main(String[] args) {
        final Stream<Integer> st = Stream.of(1);
//        final IntStream intStream = st.mapToInt(x -> x);
        final DoubleStream doubleStream = st.mapToDouble(x -> x);
        final IntStream intStream1 = doubleStream.mapToInt(x ->(int)x);
        intStream1.forEach(System.out::println);
    }
}
