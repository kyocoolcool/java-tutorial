package kyocoolcool.ch07;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ThreadTest
 * @description
 * @date 2020/7/28 11:18 AM
 **/

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("begin");
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("number:" + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("sleeping");
                }
            }
            ;
        });
        executorService.execute(() -> {
            for (int i = 10; i < 20; i++) {
                System.out.println("number:" + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("sleeping");
                }
            }
            ;
        });
        System.out.println("end");
        executorService.execute(() -> {
            for (int i = 20; i < 30; i++) {
                System.out.println("number:" + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("sleeping");
                }
            }
            ;
        });
        System.out.println("end2");
        final List<Runnable> runnables = executorService.shutdownNow();
        final boolean b = executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);
        System.out.println(b);

//        System.out.println("size:"+runnables.size());
    }
}
