package kyocoolcool.exam_v1475.exam14;

import java.time.Duration;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 4:10 PM
 **/
public class Test {
    public static void main(String[] args) {
        final Duration duration = Duration.ofHours(5);
        System.out.println(duration.toMinutes());
    }
}
