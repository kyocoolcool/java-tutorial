package kyocoolcool.exam.exam48;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 6:13 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<Integer> prices = Arrays.asList(3, 4, 5);
        prices.stream().filter(e -> e > 4).peek(e -> System.out.println("price " + e))
                .map(n -> n - 1).forEach(n -> System.out.println(" new price " + n));

    }
}
