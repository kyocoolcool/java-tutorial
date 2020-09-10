package kyocoolcool.exam_v1475.exam162;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:23 AM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Java", "Unix", "Linux");
//        strings.stream().filter(s -> s.contains("n")).peek(s -> System.out.println("peek:"+s)).findFirst();
//        strings.stream().filter(s -> s.contains("n")).peek(s -> System.out.println("peek:"+s)).findAny();
        strings.stream().filter(s -> s.contains("n")).peek(s -> System.out.println("peek:" + s)).noneMatch(s -> s.contains("Linux"));
    }
}
