package kyocoolcool.exam2.exam166;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 3:26 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final LocalDateTime of = LocalDateTime.of(2014, 7, 31, 1, 1);
        System.out.println(of.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
