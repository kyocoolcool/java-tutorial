package kyocoolcool.exam_v1475.exam103;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 5:36 PM
 **/
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);
        Stream.of(list1, list2).flatMap(list -> list.stream());
//                .forEach(s -> System.out.print(s + " "));
//        list1.stream().flatMap(list2.stream().flatMap(e1 -> Strea) .forEach(s -> System.out.println(s + " ")));
//        Stream.of(1,2)
//                .flatMapToInt(s->s.intValue())
//                .forEach(s -> System.out.print(s + " "))
    }
}
