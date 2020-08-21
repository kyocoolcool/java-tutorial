package kyocoolcool.ch04;

import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test10
 * @description
 * @date 2020/7/20 4:34 PM
 **/

public class Test10 {
    static int count = 0;
    public static void main(String[] args) {

        final Stream<String> generate = Stream.generate(() -> "1");
//        generate.limit(10).forEach(System.out::println);
        generate.limit(10).peek(s-> {
            count++;
        }).forEach(System.out::println);
        System.out.println("count:"+count);
    }
}
