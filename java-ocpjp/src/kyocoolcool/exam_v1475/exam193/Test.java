package kyocoolcool.exam_v1475.exam193;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 2:47 PM
 **/
public class Test {
    public static void main(String[] args) {
        UnaryOperator<Double> uo1 = s -> s * 2;
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv))
                .forEach(s -> System.out.print(s + " "));
    }
}
