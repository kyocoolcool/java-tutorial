package kyocoolcool.exam_v1495.exam60;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 上午 12:18
 **/
public class Test {
    public static void main(String[] args) {
        final LocalDate localDate = LocalDate.of(2015, Month.FEBRUARY, 14);
        final LocalDate nextYear = localDate.plusYears(1);
        nextYear.plusDays(15);
        System.out.println(nextYear);
    }
}