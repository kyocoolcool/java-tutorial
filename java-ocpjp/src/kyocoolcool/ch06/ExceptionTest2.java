package kyocoolcool.ch06;

import java.io.IOException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ExceptionTest2
 * @description
 * @date 2020/7/23 5:31 PM
 **/

public class ExceptionTest2 extends ExceptionTest {

    @Override
    public void play() throws IOException{
//        super.play();
        System.out.println("play");
    }


    public void play2()  {
        try {
            System.out.println("aaa");
            throw new Exception();
        } catch (Error | Exception e) {
            System.out.println(e);
            System.out.println("EEEE");
            throw new Error();
        }
    }

    public static void main(String[] args) throws IOException{
        new ExceptionTest2().play2();

    }
}
