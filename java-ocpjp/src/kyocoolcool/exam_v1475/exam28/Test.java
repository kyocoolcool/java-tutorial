package kyocoolcool.exam_v1475.exam28;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 5:32 PM
 **/
public class Test {
    public static void main(String[] args) {
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println(
                listVal.stream().filter(s -> s.length() > 3).count()
        );
    }
}
