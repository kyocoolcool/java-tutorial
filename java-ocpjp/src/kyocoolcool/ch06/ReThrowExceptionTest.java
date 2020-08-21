package kyocoolcool.ch06;

import java.sql.SQLException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ReThrowExceptionTest
 * @description
 * @date 2020/7/24 11:01 AM
 **/

public class ReThrowExceptionTest {
    public static void play() throws SQLException{
        System.out.println("play method");
        throw new SQLException();
    }

    public void play2() throws ArithmeticException,SQLException {
        try {
            play();
            System.out.println("call play method after");
        } catch (SQLException throwables) {
            System.out.println("sql exception");
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) throws SQLException {
        final ReThrowExceptionTest reThrowExceptionTest = new ReThrowExceptionTest();
        try {
            reThrowExceptionTest.play2();
        } catch (Exception e) {
            System.out.println("hhhhhhhh");
            throw e;
        }
    }
}
