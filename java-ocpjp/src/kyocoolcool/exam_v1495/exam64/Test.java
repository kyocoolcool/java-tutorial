package kyocoolcool.exam_v1495.exam64;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 11:26 AM
 **/
public class Test {
    public static void main(String[] args) {
        final ZoneId zone = ZoneId.of("America/New_York");
        final ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1, 0), zone);
        final ZonedDateTime dt2 = dt.plusHours(2);
        final LocalDateTime localDateTime = dt.toLocalDateTime();
        final LocalDateTime localDateTime2 = dt2.toLocalDateTime();
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        System.out.println(DateTimeFormatter.ofPattern("H:mm - ").format(dt2));
//        System.out.println("difference: "+ ChronoUnit.HOURS.between(dt, dt2));
        System.out.println("difference: "+ ChronoUnit.HOURS.between(localDateTime, localDateTime2));
    }
}
