package kyocoolcool.exam_v1475.exam191;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 2:32 PM
 **/
public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList (10, 20, 8);
        System.out.println(nums.stream().max(Comparator.comparing(s->s)).get());

    }
}
