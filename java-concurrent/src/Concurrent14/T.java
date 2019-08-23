package Concurrent14;

import java.util.ArrayList;

/**
 * @ClassName T
 * @Description 承上 Concurrent13 加入synchronized 保證原子操作
 * @Author kyocoolcool
 * @Date 2019-07-31 21:07
 * @Version 1.0
 **/

public class T {
    volatile int count = 0;

    synchronized  void  m() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) {
        T t = new T();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m, "thread" + i));
        }
        threads.forEach((o) -> o.start());

        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }

}