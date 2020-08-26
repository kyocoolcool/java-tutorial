package kyocoolcool.exam.exam74;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 3:27 PM
 **/
public class Test {
    public static void main(String[] args) {
        List<String> empDetails = Arrays.asList("102, Robin, HR",
                "200, Mary, AdminServices",
                "101, Peter, HR");
        empDetails.stream()
                .filter(s -> s.contains("1"))
                .sorted()
                .forEach(System.out::println); //line n1
    }
}
