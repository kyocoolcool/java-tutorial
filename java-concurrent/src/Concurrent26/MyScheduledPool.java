package Concurrent26;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyScheduledPool
 * @Description 類似於Timer能排程執行，差異在於若線程處理完後，可以再接新任務處理，若所有線程都在忙碌就等待，而Timer每次執行都會new新線程，
 * @Author Chris Chen
 * @Date 2019-08-09 21:47
 * @Version 1.0
 **/

public class MyScheduledPool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        for (int i = 0; i < 2; i++) {
            service.scheduleAtFixedRate(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }, 0, 500, TimeUnit.MILLISECONDS);
        }
        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-------");
            });
        }
    }
}