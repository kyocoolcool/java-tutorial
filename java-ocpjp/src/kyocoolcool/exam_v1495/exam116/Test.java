package kyocoolcool.exam_v1495.exam116;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 5:48 PM
 **/
public class Test {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList (100.12, 200.32);
        DoubleFunction funD = d -> d + 100.0;
//        doubles.stream().forEach(funD); // line n1
        doubles.stream().forEach(e -> System.out.println(e)); // line n2
    }
}
