package ocajp.thread;

import java.util.concurrent.*;

/**
 * @ClassName ThreadPoolExecutorDemo
 * 
 * @Author Chris Chen
 * @Date 2019-06-03 17:29
 * @Version 1.0
 **/

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        Future<Integer> future = exec.submit(new Lotto());
        System.out.println(future.get());
        exec.shutdown();
    }
}