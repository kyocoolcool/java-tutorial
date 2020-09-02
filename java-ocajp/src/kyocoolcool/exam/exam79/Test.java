package kyocoolcool.exam.exam79;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/17 3:10 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        final LocalDate date2 = LocalDate.of(2020, 2, 17);
        System.out.println(date2);
        final LocalDate date3 = LocalDate.parse("2020-02-17", DateTimeFormatter.ISO_DATE);
        System.out.println(date3);
    }
}
