package kyocoolcool.exam_v1495.exam19;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 4:39 PM
 **/
public class Test implements Runnable{
    final static AtomicInteger atomicInteger = new AtomicInteger(0);
    @Override
    public void run() {
        final int i = atomicInteger.incrementAndGet();
        System.out.println(i);
    }

    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Test());
        final Thread thread2 = new Thread(new Test());
        final Thread thread3 = new Thread(new Test());
        Thread[] ta = {thread1,thread2,thread3};
        for (int i = 0; i < ta.length; i++) {
            ta[i].start();
        }
    }
}
