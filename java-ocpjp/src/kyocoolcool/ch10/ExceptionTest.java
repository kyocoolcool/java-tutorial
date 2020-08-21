package kyocoolcool.ch10;

import java.text.ParseException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ExceptionTest
 * @description
 * @date 2020/8/17 6:14 PM
 **/

public class ExceptionTest {
    public static void test1() throws Error{
        throw new Error("0");
    }


    public static void test2() throws ParseException {
        test1();
    }

}
