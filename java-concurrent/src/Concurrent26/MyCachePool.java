package Concurrent26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyCachePool
 * @Description CachePoo:當線程在忙，會起新線程，直到伺服器能負荷數量，默認線程閒置60秒會自動銷毀
 * @Author Chris Chen
 * @Date 2019-08-09 21:34
 * @Version 1.0
 **/

public class MyCachePool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println(service);
        for (int i = 0; i < 2; i++) {
            service.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }

        System.out.println(service);
        TimeUnit.SECONDS.sleep(80);
        System.out.println(service);
    }
}