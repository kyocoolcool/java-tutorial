package kyocoolcool.exam_v1495.exam191;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 10:51
 **/
public class Test {
    public static void main(String[] args) {
        List<Double> codes = Arrays.asList (10.0, 20.0);
        UnaryOperator<Double> uo = s -> s +10.0;
        codes.replaceAll(uo);
        codes.forEach(c -> System.out.println(c));
    }
}