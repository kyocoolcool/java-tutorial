package kyocoolcool.exam2.exam80;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/23 11:05 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final LocalDate localDateTime = LocalDate.of(2014, 7, 31);
        localDateTime.plusDays(30);
        localDateTime.plusMonths(1);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
    }
}
