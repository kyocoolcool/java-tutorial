package kyocoolcool.ch06;

import java.io.IOException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ExceptionTest
 * @description
 * @date 2020/7/23 5:26 PM
 **/

public class ExceptionTest {


    public void play() throws IOException {
        throw new ArithmeticException();
//        throw new ClassCastException();
    }
}
