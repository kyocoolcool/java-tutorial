package kyocoolcool.exam2.exam83;

import java.io.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/23 11:21 PM
 * @Version 1.0
 **/

class A {
    public  void main(String[] args) throws IOException{
        System.out.println("aaa");
    }
}

public class Test {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ne) {
            System.out.println("A");
        }
    }

    public  void main(String args) throws IOException {

    }

    public static void method1() throws Exception {
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (MyException re) {
            System.out.println("B");
        }
    }
}
