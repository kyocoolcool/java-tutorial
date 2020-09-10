package kyocoolcool.exam_v1475.exam164;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:34 AM
 **/
public class Test {
    public static void main(String[] args) {
        List<String> empDetails = Arrays.asList("100, Robin, HR",
                "200, Mary, AdminServices",
                "101, Peter, HR");
        empDetails.stream()
                .filter(s -> s.contains("1"))
                .sorted()
                .forEach(System.out::println); //line n1
    }
}
