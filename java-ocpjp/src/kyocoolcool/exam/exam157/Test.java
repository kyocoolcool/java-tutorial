package kyocoolcool.exam.exam157;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 10:38 AM
 **/
public class Test {
    public static void main(String[] args) {
        UnaryOperator<Double> uo1 = s -> s*2;//line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv))//line n2
                .forEach(s -> System.out.print(s + " "));
    }
}
