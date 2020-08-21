package kyocoolcool.ch05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className DateFormateTest
 * @description
 * @date 2020/7/24 9:49 AM
 **/

public class DateFormateTest {
    public static void main(String[] args) {
        final LocalDateTime now = LocalDateTime.now();
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd hh:mm:ss");
        final String format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}
