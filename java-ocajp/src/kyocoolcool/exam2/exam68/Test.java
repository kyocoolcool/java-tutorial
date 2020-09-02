package kyocoolcool.exam2.exam68;

import java.time.LocalDate;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/23 10:11 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final LocalDate localDate = LocalDate.of(2012, 1, 30);
        localDate.plusDays(10);
        System.out.println(localDate);
    }

}
