package Prod;

import Concurrent26.MyThreadPoolExecutor;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Test1
 * @Description 多線程實作
 * @Author Chris Chen
 * @Date 2020/2/18 9:27 AM
 * @Version 1.0
 **/

public class Test1 {
    volatile ConcurrentSkipListSet<Integer> list = new ConcurrentSkipListSet<Integer>();
    volatile int count = 0;
    Lock lock = new ReentrantLock();

    public void work(ConcurrentSkipListSet list) throws IOException, InterruptedException {
        while (list.size() != 0) {
            lock.lock();
            if (list.size() != 0) {
                final Integer str = (Integer) list.pollFirst();
                OutputStream out = new FileOutputStream("/opt/app/APIS/aaa.txt", true);
                count++;
                final StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("線程名:" + Thread.currentThread().getName() + " ------- " + "次數:" + count + " ------- 內容:" + str);
                final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(stringBuilder.toString().getBytes());
                byte[] buffer = new byte[1024];
                int len;
                while ((len = byteArrayInputStream.read(buffer)) > 0) {
                    out.write(buffer, 0, len);
                }
                final byte[] bytes = new byte[10];
                out.write(bytes, 0, new ByteArrayInputStream("\r\n".getBytes()).read(bytes));
                byteArrayInputStream.close();
                out.close();
            }
            lock.unlock();
            Thread.sleep(100);
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        final LocalDateTime now = LocalDateTime.now();
        final Test1 test1 = new Test1();
        int i = 1;
        while (i <= 100) {
            test1.list.add(i);
            i++;
        }

        ThreadPoolExecutor  threadPool = new ThreadPoolExecutor(
                5,
                10,
                30,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(50),
                new CustomThreadFactory(),
                new RejectHandle());

//        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int x = 0; x < 5; x++) {
            threadPool.execute(() -> {
                try {
                    test1.work(test1.list);
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "完成");
            });
        }

        threadPool.shutdown();
        try {//等待直到所有任务完成
            threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        final Thread t1 = new Thread(() -> {
//            try {
//                test1.work(test1.list);
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "t1");
//        t1.start();

//        final Thread t2 = new Thread(() -> {
//            try {
//                test1.work(test1.list);
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "t2");
//        t2.start();

//        t1.join();

//        t2.join();

        final LocalDateTime now1 = LocalDateTime.now();
        final Duration between = Duration.between(now, now1);
        System.out.println("花費時間:" + between.getSeconds() + "秒");
    }


}
 class CustomThreadFactory implements ThreadFactory {

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

 class RejectHandle implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("後面全都丟掉");
    }
}
