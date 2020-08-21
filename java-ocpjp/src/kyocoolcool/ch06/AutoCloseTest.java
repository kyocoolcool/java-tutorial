package kyocoolcool.ch06;

import java.io.IOException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className AutoCloseTest
 * @description
 * @date 2020/7/24 10:16 AM
 **/

public class AutoCloseTest {
    class Hello implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("Hello auto clode");
        }
    }

    class Hello2 implements AutoCloseable {

        @Override
        public void close() throws IOException {
            System.out.println("Hello2 auto clode");
            throw new IOException();
        }
    }

    class Hello3 implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("Hello2 auto clode");
            throw new IllegalStateException("aaaa");
        }
    }

    public void main() {
//        try (Hello hello = new Hello()) {
//            System.out.println("Hello in");
//        }
//        try (Hello2 hello = new Hello2()) {
//            System.out.println("Hello2 in");
//        } catch (IOException e) {
//            System.out.println("hello2 exception");
//        }
        try (Hello3 hello = new Hello3()) {
            System.out.println("Hello3 in");
            throw new IllegalStateException("hello 3 iiiii");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            for (Throwable throwable : e.getSuppressed()) {
//                System.out.println(throwable.getMessage());
//            }
        }
        finally {
//            throw new RuntimeException("rrrrrr");
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        new AutoCloseTest().main();
    }
}

