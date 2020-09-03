package kyocoolcool.exam_v1495.exam105;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 11:10 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> list1 = Arrays.asList(10, 20);
        final List<Integer> list2 = Arrays.asList(15, 30);
//        Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s-> System.out.println(s));
//        list1.stream().flatMap(list2.stream().flatMap(e1 -> e1).forEach(s -> System.out.println(s ));
        Stream.of(list1, list2).flatMapToInt(x->IntStream.of(x.get(0),x.get(1))).forEach(s -> System.out.print(s + " "));
    }
}
