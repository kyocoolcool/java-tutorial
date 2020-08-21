package kyocoolcool.ch04;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest3
 * @description
 * @date 2020/7/16 5:22 PM
 **/

public class LambdaTest3 {
    public static void main(String[] args) {
        final Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        final Integer reduce = integerStream.reduce(2, (a, b) -> a * b);
        System.out.println(reduce);
//        int length = Arrays.asList("one", "two","three","four")
//                .parallelStream()
//                .reduce(0,
//                        (accumulatedInt, str) -> {
////                            System.out.println(accumulatedInt);
//                    return accumulatedInt + str.length();},                 //accumulator
//                        (accumulatedInt, accumulatedInt2) ->{
//                            System.out.println("accumulatedInt:" + accumulatedInt);
//                            System.out.println("accumulatedInt2:" + accumulatedInt2);
//                                return accumulatedInt + accumulatedInt2; //combiner
//                        });
//        System.out.println(length);
        final Stream<String> stream = Stream.of("one", "two", "three","four","five");
        final BiFunction<Integer,String,Integer> bif = (a, b) -> {
            System.out.println("bif---a:"+a);
            System.out.println("bif---b:"+b);
            return a + b.length();};
        final BinaryOperator<Integer> op = (a, b) -> {
            System.out.println("op---a:"+a);
            System.out.println("op---b:"+b);
            return null;};//只是用來轉型，內部邏輯完全不會執行到
        final Integer reduce1 = stream.reduce(0, bif, op);
        System.out.println(reduce1);


        final List<String> a = Arrays.asList();
        final List<String> b = Arrays.asList("bbbbb");
        final List<String> c = Arrays.asList("ccc","ccccc");
        final Stream<List<String>> stream3 = Stream.of(a, b, c);
        final Stream<String> stringStream = stream3.flatMap(Collection::stream);
        stringStream.forEach(System.out::println);
//        stringStream.count();
        stream3.forEach(System.out::println);

    }
}
