package kyocoolcool.ch04;

import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test06
 * @description
 * @date 2020/7/20 4:09 PM
 **/

public class Test06 {
    public static void main(String[] args) {
//        final Stream<String> generate = Stream.generate(() -> "hello.txt");
        final Stream<String> generate = Stream.iterate("a",x -> x+"hello.txt");
        final boolean b = generate.allMatch(String::isEmpty);
        System.out.println(b);
    }
}
