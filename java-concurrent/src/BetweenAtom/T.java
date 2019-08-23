package BetweenAtom;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName T
 * @Description 原子操作與原子操作之間還是要用鎖才能保證安全
 * @Author kyocoolcool
 * @Date 2019-07-31 21:07
 * @Version 1.0
 **/

public class T {
    /* volatile int count = 0; */
    AtomicInteger count = new AtomicInteger();

   /* synchronized */ void  m() {
        for (int i = 0; i < 10000; i++) {
            if(count.get()<1000)
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        T t = new T();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m, "thread" + i));
        }
        threads.forEach((o) -> o.start());

//        threads.forEach((o)->{
//            try {
//                o.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
        System.out.println(t.count);
    }

}