package kyocoolcool.exam_v1495.exam101;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/19 10:22 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final LocalDateTime d = LocalDateTime.of(2014, 7, 31, 1, 1);
        final LocalDateTime localDateTime = d.plusDays(30);
        final LocalDateTime localDateTime1 = localDateTime.plusMonths(1);
        System.out.println(localDateTime1.format(DateTimeFormatter.ISO_DATE));
    }
}
