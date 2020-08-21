package kyocoolcool.ch05;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className InstantTest
 * @description
 * @date 2020/7/23 3:34 PM
 **/

public class InstantTest {
    public static void main(String[] args) {
        final Instant now = Instant.now();
        final Instant plus = now.plus( 30, ChronoUnit.DAYS);
        System.out.println(plus);
    }
}
