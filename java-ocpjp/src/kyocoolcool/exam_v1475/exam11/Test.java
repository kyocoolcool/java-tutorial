package kyocoolcool.exam_v1475.exam11;

import lombok.extern.java.Log;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 3:48 PM
 **/
@Log
public class Test {
    public static void main(String[] args) {
        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0,
                ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0,
                ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
//        log.info("Travel time is" + hrs + "hours");
    }
}
