package kyocoolcool.exam2.exam30;

import java.io.IOException;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/21 3:58 PM
 * @Version 1.0
 **/

public class Test {

    public static void a() throws Exception {
//        try {
            throw 8 > 10 ? new MyException() : new IOException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) throws Exception {
        try {
            a();
        } catch (MyException e) {
            System.out.println("A");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
