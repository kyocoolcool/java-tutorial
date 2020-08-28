package kyocoolcool.exam.exam140;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 2:48 PM
 **/
public class Test {
    public static void main(String[] args) {
        long until = 0;
        final LocalTime now = LocalTime.now();
        System.out.println(now);
        final LocalTime of = LocalTime.of(13, 50, 00);
        System.out.println(of);
        if (of.isAfter(now)) {
            until = now.until(of, MINUTES);
        } else {
            until = now.until(of, HOURS);
        }
        System.out.println(until);
    }
}
