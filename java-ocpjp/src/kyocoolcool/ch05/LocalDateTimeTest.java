package kyocoolcool.ch05;

import java.time.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LocalDateTimeTest
 * @description
 * @date 2020/7/21 2:37 PM
 **/

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime);
        final Period period = Period.ofWeeks(3);
        System.out.println(period);
        final Duration duration = Duration.ofSeconds(3600);
        System.out.println(duration);
    }
}
