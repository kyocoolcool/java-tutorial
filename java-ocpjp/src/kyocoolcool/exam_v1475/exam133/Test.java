package kyocoolcool.exam_v1475.exam133;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 9:58 AM
 **/
public class Test {
    public static void main(String[] args) {
        IntStream stream = IntStream.of (1,2,3);
        IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
        IntStream newStream = stream.map(inFu.apply(10));//line n2
        newStream.forEach(System.out::print);
    }
}
