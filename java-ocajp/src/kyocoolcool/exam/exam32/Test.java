package kyocoolcool.exam.exam32;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/11 3:01 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final String s = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s);
    }
}
