package kyocoolcool.ch05;

import java.time.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className DayLightTest
 * @description
 * @date 2020/7/21 5:16 PM
 **/

public class DayLightTest {
    public static void main(String[] args) {
        final LocalDate localDate = LocalDate.of(2016, Month.MARCH, 13);
        final LocalTime localTime = LocalTime.of(1, 30);
        final ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zdt = ZonedDateTime.of(localDate, localTime,zoneId);
        System.out.println(zdt);
         zdt = zdt.plusHours(1);
        System.out.println(zdt);
        zdt = zdt.plusHours(1);
        System.out.println(zdt);


    }
}
