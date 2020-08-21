package kyocoolcool.ch07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test
 * @description
 * @date 2020/7/28 5:05 PM
 **/

public class AwaitThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.execute(() -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            System.out.println("aaa");
        } finally {
            if (service != null) service.shutdown();
        }
        if (service != null) {
            System.out.println("bbb");
            service.awaitTermination(5, TimeUnit.SECONDS);
            if (service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
