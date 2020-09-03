package kyocoolcool.exam_v1495.exam151;

import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 7:20 PM
 **/
public class Test {
    public static void main(String[] args) {
        IntConsumer intConsumer = x -> System.out.println(x);
        Integer value = 90;
//        Function<Integer,Integer> funRef = e->e+10;
//        IntFunction<Integer> funRef = e -> e + 10;
        ToIntFunction<Integer> funRef = e -> e + 10;
        final int result = funRef.applyAsInt(value);
//        final Integer result = funRef.apply(value);
//        final Integer result = (Integer) apply;
        intConsumer.accept(result);
    }
}
