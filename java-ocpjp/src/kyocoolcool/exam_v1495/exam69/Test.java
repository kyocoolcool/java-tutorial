package kyocoolcool.exam_v1495.exam69;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 2:25 PM
 **/
public class Test {
    public static void main(String[] args) {
        final LocalDate of = LocalDate.of(2015, Month.FEBRUARY, 14);
//        final LocalDate of = LocalDate.of(2016, Month.FEBRUARY, 14);
        final LocalDate localDate = of.plusDays(15);
        System.out.println(localDate);
        final LocalDate localDate1 = localDate.plusYears(1);
        System.out.println(localDate1);

    }
}
