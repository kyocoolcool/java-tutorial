package kyocoolcool.exam_v1475.exam137;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:05 AM
 **/
public class Test {
    public static void main(String[] args) {
        Stream<List<String>> list=Stream.of(Arrays.asList("text1", "textt2"));
        list.filter(s -> s.contains("text1")).flatMap(li->li.stream()).forEach(System.out::println);
    }
}
