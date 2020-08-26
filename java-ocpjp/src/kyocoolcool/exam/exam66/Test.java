package kyocoolcool.exam.exam66;

import java.util.function.BiFunction;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 11:45 AM
 **/
public class Test {
    public static void main(String[] args) {
        BiFunction<Integer, Double, Double> biFunction = (x, y) -> x + y;
        System.out.println(biFunction.apply(1, 2.5));
//        final Double aLong = new Double("2.5");
//        System.out.println(aLong);
    }
}
