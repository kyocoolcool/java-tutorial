package ocajp;


import java.io.IOException;

/**
 * @ClassName ExceptionTest4
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-07-09 18:33
 * @Version 1.0
 **/

public class ExceptionTest4 {
    public static void main(String[] args) throws IOException{
        try {
            dosomething();
//        } catch (IOException r) {
//            System.out.println("aaa");
        } catch (RuntimeException e) {
            System.out.println("ddd");
        }

    }

    static void dosomething() throws IOException{
        if(Math.random()>0.5)
            throw new IOException();
        throw new RuntimeException();
    }
}