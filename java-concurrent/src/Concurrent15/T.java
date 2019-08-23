package Concurrent15;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName T
 * @Description 若簡單的運算利用AtomXXX類原子操作更高效(花費時間短)
 * @Author kyocoolcool
 * @Date 2019-07-31 21:07
 * @Version 1.0
 **/

public class T {
    /* volatile int count = 0; */
    AtomicInteger count = new AtomicInteger();

    /* synchronized */ void m() {
        for (int i = 0; i < 1000000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        T t = new T();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m, "thread" + i));
        }
        threads.forEach((o) -> o.start());

        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
        Date date1 = new Date();
        System.out.println(date1.getTime() - date.getTime());
    }

}