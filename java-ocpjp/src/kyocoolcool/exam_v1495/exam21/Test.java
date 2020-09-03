package kyocoolcool.exam_v1495.exam21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 4:56 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
//        System.out.println(listVal.stream().filter(x->x.length()>3).count());
        final Stream<String> peek = listVal.stream().peek(x -> System.out.println(x));
//        final Optional<String> max = peek.max(1);
//        peek.forEach(System.out::println);
//        booleanStream.forEach(x-> System.out.println(x));

    }
}
