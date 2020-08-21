package Concurrent26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyThreadPool
 * @Description ThreadPool:線程池 維護兩個queue，任務隊列//完成隊列，
 * 此範例線程池內有五個線程執行，剩餘一個任務會先放在tasks queue，當一有空閒線程就會去執行此任務
 * @Author Chris Chen
 * @Date 2019-08-09 13:32
 * @Version 1.0
 **/

public class MyThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);//可利用executor//summit執行
        System.out.println(service);
        for (int i = 0; i < 6; i++) {
            service.execute(() -> {
                try {
                    TimeUnit.MICROSECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        System.out.println(service);
        service.shutdown();//等所有線程都完成才會關閉
        System.out.println(service.isTerminated());//線程是不是執行完成
        System.out.println(service.isShutdown());//正在關閉中
        System.out.println(service);
        TimeUnit.SECONDS.sleep(5);
        System.out.println(service.isTerminated());
        System.out.println(service.isShutdown());
        System.out.println(service);
    }
}
