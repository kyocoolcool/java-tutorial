package ocajp.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName AtomicTest
 *
 * @Author Chris Chen
 * @Date 2019-06-10 15:55
 * @Version 1.0
 **/

public class AtomicTest extends Thread{
    public static final  AtomicInteger num=new AtomicInteger();

    @Override
    public void run() {
        num.incrementAndGet();
        System.out.println(num.get());
    }

    public static void main(String[] args) {
        AtomicTest atomicTest = new AtomicTest();
        atomicTest.start();
    }
}