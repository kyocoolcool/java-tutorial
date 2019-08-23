package ocajp.text;

import org.junit.Test;

import java.util.Date;

/**
 * @ClassName DateTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-28 10:24
 * @Version 1.0
 **/

public class DateTest {
    @Test
    public void test() {
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void test2() {
        Date date = new Date(0);
        System.out.println(date);
    }

    @Test
    public void test3() {
        Date date = new Date(1000*60*60*24);
        System.out.println(date);
    }

    @Test
    public void test4() {
        Date date = new Date();
        date.setTime(date.getTime() + 1000 * 60 * 60 * 24);
        System.out.println(date);
    }
}