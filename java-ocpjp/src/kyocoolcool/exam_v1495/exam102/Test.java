package kyocoolcool.exam_v1495.exam102;

import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 10:38 AM
 **/
public class Test {
    public static void main(String[] args) {
        Stream.of("Java", "Unix", "Linux").filter(x -> x.contains("n")).peek(s -> System.out.println("peek:" + s)).findFirst();
    }
}
