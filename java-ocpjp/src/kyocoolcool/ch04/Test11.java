package kyocoolcool.ch04;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test11
 * @description
 * @date 2020/7/20 4:51 PM
 **/

public class Test11 {
    public static void main(String[] args) {
        final String collect = Stream.iterate(1, x -> ++x).limit(5).map(s -> "" + s).collect(Collectors.joining());
        Stream.iterate(1, x -> ++x).limit(5).map(s ->s).forEach(System.out::println);
//        System.out.println(collect);
    }
}
