package kyocoolcool.exam_v1475.exam87;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 3:16 PM
 **/
class MyThread implements Runnable {
    private static AtomicInteger count = new AtomicInteger(0);

    public void run() {
//        int x = count.incrementAndGet();
//        System.out.print(x + " ");
        System.out.println(count.incrementAndGet());
    }
}

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }
}
