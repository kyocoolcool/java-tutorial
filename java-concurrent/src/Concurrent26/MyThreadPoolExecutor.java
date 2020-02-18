package Concurrent26;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyThreadPoolExecutor
 * @Description 自定義線程池(ThreadPoolExecutor : 支撐許多的線程持實作)
 * @Author Chris Chen
 * @Date 2019-08-11 14:37
 * @Version 1.0
 **/

public class MyThreadPoolExecutor {
    private ThreadPoolExecutor pool = null;
    public volatile String[] aa = {"aa","bb","cc","dd","ee","ff","gg","hh","ii","aa","bb","cc","dd","ee","ff","gg","hh","ii","aa","bb","cc","dd","ee","ff","gg","hh","ii"};

    /**
     * 线程池初始化方法
     * <p>
     * corePoolSize 核心线程池大小----1
     * maximumPoolSize 最大线程池大小----3
     * keepAliveTime 线程池中超过corePoolSize数目的空闲线程最大存活时间----30+单位TimeUnit
     * TimeUnit keepAliveTime时间单位----TimeUnit.MINUTES
     * workQueue 阻塞队列----new ArrayBlockingQueue<Runnable>(5)====5容量的阻塞队列
     * threadFactory 新建线程工厂----new CustomThreadFactory()====定制的线程工厂
     * rejectedExecutionHandler 当提交任务数超过maxmumPoolSize+workQueue之和时,
     * 即当提交第41个任务时(前面线程都没有执行完,此测试方法中用sleep(100)),
     * 任务会交给RejectedExecutionHandler来处理
     */
    public void init() {
        pool = new ThreadPoolExecutor(
                1,
                5,
                30,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(5),
                new CustomThreadFactory(),
                new RejectHandle());
    }


    public void destory() {
        if (pool != null) {
            pool.shutdownNow();
        }
    }


    public ExecutorService getCustomThreadPoolExecutor() {
        return this.pool;
    }

    private class CustomThreadFactory implements ThreadFactory {

        private AtomicInteger count = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            String threadName = MyThreadPoolExecutor.class.getSimpleName() + count.addAndGet(1);
            System.out.println(threadName);
            t.setName(threadName);
            return t;
        }
    }

    private class RejectHandle implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("後面全都丟掉");
        }
    }


    private class CustomRejectedExecutionHandler implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            try {
                // 核心改造点，由blockingqueue的offer改成put阻塞方法
                executor.getQueue().put(r);
//                if(executor.getQueue().size()<5) {
//                    executor.getQueue().put(r);
//                }else{
//                    System.out.println("我丟了");
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    // 测试构造的线程池
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        final MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor();
        MyThreadPoolExecutor exec = new MyThreadPoolExecutor();
        // 1.初始化
        exec.init();

        ExecutorService pool = exec.getCustomThreadPoolExecutor();
        for (int i = 0; i < myThreadPoolExecutor.aa.length; i++) {
            System.out.println("提交第" + i + "个任务!");
             int ii = i;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
//                        synchronized (myThreadPoolExecutor) {
                        lock.lock();

                        myThreadPoolExecutor.aa[ii] = myThreadPoolExecutor.aa[ii]+"JJ";
                            System.out.println(Thread.currentThread().getName() + ":我買了1個，剩下:" + myThreadPoolExecutor.aa + "個");
//                            TimeUnit.SECONDS.sleep(10);
                        for (String s : myThreadPoolExecutor.aa) {
                            System.out.println(s);
                        }
                        System.out.println("印完了");
                        lock.unlock();
//                        }
                    } catch (Exception e) {
                        System.out.println("超載了後面全都丟掉");
                    }
                }
            });
        }




        // 2.销毁----此处不能销毁,因为任务没有提交执行完,如果销毁线程池,任务也就无法执行了
        // exec.destory();
        System.out.println("主線程執行完了");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("再來一次");
        for (int i = 0; i < 10; i++) {
            pool.execute(() ->System.out.println("hello"));
        }
        pool.shutdown();

    }
}