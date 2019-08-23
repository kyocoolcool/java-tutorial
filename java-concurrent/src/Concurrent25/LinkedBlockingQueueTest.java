package Concurrent25;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName LinkedBlockingQueueTest
 * @Description LinkedBlockingQueue(無界(直到把記憶體充滿)阻塞隊列)實現生產與消費者應用
 * @Author Chris Chen
 * @Date 2019-08-08 10:25
 * @Version 1.0
 **/

public class LinkedBlockingQueueTest {
    static LinkedBlockingQueue queue = new LinkedBlockingQueue<>();
    static Random random = new Random();

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    queue.put("a" + i);//如果滿了就會等待
                    TimeUnit.MICROSECONDS.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "provider").start();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (; ; ) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ", take:" + queue.take());//如果空了就會等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "consumer" + i).start();
        }

    }
}