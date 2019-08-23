package Concurrent26;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyWorkStralingPool
 * @Description 每個線程各自有自己處理的隊列，當隊列已無任務時，會取別的線程處理的任務來處理(底層是由ForkJoniPool來實現)
 * @Author Chris Chen
 * @Date 2019-08-10 13:49
 * @Version 1.0
 **/

public class MyWorkStralingPool {
    public static void main(String[] args) throws IOException {
        ExecutorService service = Executors.newWorkStealingPool(4);
        System.out.println(Runtime.getRuntime().availableProcessors());
        service.execute(new R(1000));
        service.execute(new R(1000));
        service.execute(new R(2000));
        service.execute(new R(2000));
        service.execute(new R(2000));
        service.execute(new R(2000));
        service.execute(new R(2000));//daemon線程
        service.execute(new R(2000));
        service.execute(new R(2000));
        service.execute(new R(500));

        //由於產生的是精靈線程(守護線程、後台線程)，主線程不阻塞的話，看不到輸出
        System.in.read();
    }

    static class R implements Runnable {

        int time;

        public R(int time) {
            this.time = time;
        }

        @Override
        public void run() {
            try {
                TimeUnit.MICROSECONDS.sleep(time
                );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(time+" "+Thread.currentThread().getName());
        }
    }

}
