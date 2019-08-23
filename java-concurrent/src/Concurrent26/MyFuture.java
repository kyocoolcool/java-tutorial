package Concurrent26;

import java.util.concurrent.*;

/**
 * @ClassName MyFuture
 * @Description Runnable經由FutureTask封裝交由Thread執行
 * @Author Chris Chen
 * @Date 2019-08-09 16:08
 * @Version 1.0
 **/

public class MyFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*單一線程執行*/
        FutureTask<Integer> task = new FutureTask<>(()->{
            TimeUnit.SECONDS.sleep(1);
            return 1000;
        });//new Callable(){Integer call();}

        new Thread(task).start();
        System.out.println(task.get());//阻塞

        /*線程池執行*/
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1000;
        });

        System.out.println(future.isDone());
        System.out.println(future.get());//會阻塞
        System.out.println(future.isDone());
    }
}