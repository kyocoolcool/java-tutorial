package kyocoolcool.exam_v1495.exam181;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 08:05
 **/
public class Test {
    public static void main(String[] args) {
        UnaryOperator<Integer> uo1 = s -> s * 2;//line n1
        List<Integer> loanValues = Arrays.asList(1000, 2000);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv))//line n2
                .forEach(s -> System.out.print(s + " "));
    }
}