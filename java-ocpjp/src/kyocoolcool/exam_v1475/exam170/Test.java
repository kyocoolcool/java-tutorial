package kyocoolcool.exam_v1475.exam170;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:49 AM
 **/
public class Test {
    public static void main(String[] args) {
        IntConsumer intConsumer = e -> System.out.println(e);
        Integer value = 90;
        IntFunction<Integer> funRef = e ->e + 10;
        Integer result = funRef.apply(value);
        intConsumer.accept(result);
    }
}
