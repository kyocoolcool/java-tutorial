package ocajp.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-06 16:50
 * @Version 1.0
 **/

public class DateTest {

    @Test
    public void test() throws ParseException {
        String a="2018-05-02 09:00:00.000";
        SimpleDateFormat x = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
        Date day = x.parse(a);
        System.out.println(day);
    }
}