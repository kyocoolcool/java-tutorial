package kyocoolcool.exam_v1495.exam190;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 10:29
 **/
public class Test {
    public static void main(String[] args) {

        IntStream stream = IntStream.of (1,2,3);
//        final IntFunction<Integer> doubleToIntFunction = x -> x + x;
        IntFunction<IntUnaryOperator> inFu= x -> y->x*y;//line n1
        IntStream newStream = stream.map(inFu.apply(10));//line n2
        newStream.forEach(System.out::println);
    }
}