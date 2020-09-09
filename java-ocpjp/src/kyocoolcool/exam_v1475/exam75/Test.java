package kyocoolcool.exam_v1475.exam75;

import java.util.stream.IntStream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 11:51 AM
 **/
public class Test {
    public static void main(String[] args) {
        IntStream str = IntStream.of (1, 2, 3, 4);
        final double asDouble = str.average().getAsDouble();
        System.out.println(asDouble);
    }
}
