package kyocoolcool.exam_v1495.exam168;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 5:06 PM
 **/
public class Test {
    public static void main(String[] args) {
        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 1, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart, arrive);
        //line n1
        System.out.println("Travel time is" + hrs + " hours");
    }
}
