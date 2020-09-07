package kyocoolcool.exam_v1475.exam37;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 3:15 PM
 **/
public class Test {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "ou"};
        final ArrayList<String> strings = new ArrayList<>(Arrays.asList(arr));
        if (strings.removeIf(s -> s.length() <= 2)) {
            System.out.println("removed something");
        }

        System.out.println(strings);
    }
}
