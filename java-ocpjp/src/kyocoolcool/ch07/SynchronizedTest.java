package kyocoolcool.ch07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className SynchronizedTest
 * @description
 * @date 2020/7/30 11:50 AM
 **/

public class SynchronizedTest {
    public AtomicInteger count = new AtomicInteger(1);

    public void add() {
        synchronized (this) {
            System.out.print(" R" + count.getAndIncrement());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        final SynchronizedTest synchronizedTest = new SynchronizedTest();
        for (int i = 1; i <= 10; i++) {
//            synchronized (synchronizedTest) {
                executorService.submit(() -> {
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }

                            synchronizedTest.add();
                        }

                );
//            }
            if (i == 10) {
                executorService.shutdown();
            }
        }
//        executorService.shutdown();
        final boolean b = executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(b);
    }
}
