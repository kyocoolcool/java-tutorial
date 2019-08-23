package Concurrent19;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyContainer5
 * @Description 使用CountDownLatch不涉及鎖定，當count的值為零時，當前thread繼續運行
 * 當不涉及同步，只是涉及thread通信的時候，用synchronized + wait/notify 就顯得太重
 * 這時應該考慮CountDownLatch / CyclicBarrier / Semaphore
 * @Author Chris Chen
 * @Date 2019-08-01 16:58
 * @Version 1.0
 **/

public class MyContainer5 {
    volatile List list = new ArrayList();

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyContainer5 c = new MyContainer5();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(() -> {
                System.out.println("t2 start");
                    if (c.size() != 5) {
                        try {
                            countDownLatch.await();
                            //也可以指定等待時間
                            //countDownLatch.await(5000,TimeUnit.MICROSECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                System.out.println("t2 end");
        }, "t2").start();

        new Thread(() -> {
            System.out.println("t1 start");
                for (int i = 0; i < 10; i++) {
                    c.add(new Object());
                    System.out.println("add " + i);
                    if (c.size() == 5) {
                        //打開latch讓t2得以運行
                     countDownLatch.countDown();
                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t1 end");
        }, "t1"
        ).start();


    }

}