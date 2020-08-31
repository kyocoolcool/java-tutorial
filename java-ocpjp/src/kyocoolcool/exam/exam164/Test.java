package kyocoolcool.exam.exam164;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 3:52 PM
 **/
public class Test {
    public static void main(String[] args) {
        final Stream<List<String>> stream = Stream.of(Arrays.asList("text1", "text2"),
                Arrays.asList("text2", "text3")
        );
        final Stream<String> stream1 = stream.filter(s -> s.contains("text1")).flatMap(s -> s.stream());
        stream1.forEach(System.out::println);

    }
}
