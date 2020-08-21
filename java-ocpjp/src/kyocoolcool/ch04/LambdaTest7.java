package kyocoolcool.ch04;


import java.util.stream.IntStream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest7
 * @description
 * @date 2020/7/20 3:00 PM
 **/

public class LambdaTest7 {
    public static void main(String[] args) {
        IntStream.iterate(1, n -> n + 1)
                .skip(Integer.parseInt("1"))
                .limit(Integer.parseInt("2"))
                .filter(x -> x < 5)
                .forEach(System.out::println);
    }
}

