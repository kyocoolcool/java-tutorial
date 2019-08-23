package myjava8;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @ClassName FuctionTest2
 * @Description TODO
 * @Author chris
 * @Date 2019-02-19 18:22
 * @Version 1.0
 **/

public class FuctionTest2 {
    public static void main(String[] args) {
        FuctionTest2 fuctionTest2 = new FuctionTest2();
        System.out.println(fuctionTest2.compute(2, value -> value * 3, value -> value * value));
        System.out.println(fuctionTest2.compute2(2, value -> value * 3, value -> value * value));
        System.out.println(fuctionTest2.compute3(2, value -> value * 3, value -> value * value));
        System.out.println(fuctionTest2.compute4(4, 2, (value, value2) -> value + value2, value -> value * value));
        System.out.println(fuctionTest2.compute5(4, 2, (value, value2) -> value + value2));
        System.out.println(fuctionTest2.compute5(4, 2, (value, value2) -> value - value2));
        System.out.println(fuctionTest2.compute5(4, 2, (value, value2) -> value * value2));
        System.out.println(fuctionTest2.compute5(4, 2, (value, value2) -> value / value2));
    }

    public Integer compute(Integer a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public Integer compute2(Integer a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public Integer compute3(Integer a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).compose(function2).apply(a);
    }

    public Integer compute4(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction,
                            Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }

    public Integer compute5(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }
}