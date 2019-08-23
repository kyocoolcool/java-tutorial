package Concurrent26;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @ClassName MySingleThreadPool
 * @Description SingleThreadPool無論多少task，只會起一個線程處理
 * @Author Chris Chen
 * @Date 2019-08-09 21:42
 * @Version 1.0
 **/

public class MySingleThreadPool {
    public static void main(String[] args) {
        var service = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 5; i++) {
            final int j = i;
            service.execute(()->{
                System.out.println(j+"  "+Thread.currentThread().getName());
            });
        }
    }
}