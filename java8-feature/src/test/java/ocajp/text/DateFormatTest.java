package ocajp.text;


import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName DateFormatTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-28 09:10
 * @Version 1.0
 **/

public class DateFormatTest {
    private static Date date = new Date();

    @Test
    public void test() {
        show(DateFormat.SHORT, DateFormat.SHORT, Locale.TAIWAN);
        show(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.TAIWAN);
        show(DateFormat.LONG, DateFormat.LONG, Locale.TAIWAN);
        show(DateFormat.FULL, DateFormat.FULL, Locale.TAIWAN);
    }


    private static void show(int dateFormat, int timeFormat, Locale local) {
        DateFormat dateInstance = DateFormat.getDateTimeInstance(dateFormat, timeFormat, local);
        System.out.println(dateInstance.format(date));
    }

    @Test
    public void test2() {
        Date d = null;
        String ds = "2019年6月27日";
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.TAIWAN);
        try {
            d = df.parse(ds);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        System.out.println(d);
        System.out.println(df.format(d));

    }

    @Test
    public void test3() {
        Date d = null;
        String ds = "今天是:2019年6月28日 星期五";
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.TAIWAN);
            d = df.parse(ds,new ParsePosition(4));
        System.out.println(d);
        System.out.println(df.format(d));
    }

    @Test
    public void test4() throws Exception{
        Date d = null;
        String ds = "6/28/19";
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        d = df.parse(ds);
        System.out.println(d);
        System.out.println(df.format(d));
    }

    @Test
    public void test5() throws Exception{
        Date d = null;
        String ds = "July 22, 2005";
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        d = df.parse(ds);
        System.out.println(d);
        System.out.println(df.format(d));
    }
}