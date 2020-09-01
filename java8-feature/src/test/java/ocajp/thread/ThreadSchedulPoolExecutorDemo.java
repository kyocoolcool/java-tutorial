package ocajp.thread;

import java.util.concurrent.*;

/**
 * @ClassName ThreadSchedulPoolExecutorDemo
 * 
 * @Author Chris Chen
 * @Date 2019-06-03 17:59
 * @Version 1.0
 **/

public class ThreadSchedulPoolExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**單一ThreadScheduledExecutor*/
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        /**只執行一次
         ScheduledFuture<Integer> schedule = exec.schedule(new Lotto(), 1000, TimeUnit.MILLISECONDS);
         */
        /**排程執行延遲時間
         ScheduledFuture<?> future = exec.scheduleWithFixedDelay(new Lotto2(), 1000, 1000, TimeUnit.MILLISECONDS);
         */
        /**排程執行間隔時間*/
        ScheduledFuture<?> future = exec.scheduleAtFixedRate(new Lotto2(), 1000, 1000, TimeUnit.MILLISECONDS);

        System.out.println(future.get());
        /**關閉*/
//        exec.shutdown();
    }
}