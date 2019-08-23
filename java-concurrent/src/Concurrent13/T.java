package Concurrent13;

import java.util.ArrayList;

/**
 * @ClassName T
 * @Description volatile並不能保證多個thread共同修改running所帶來不一致的問題，
 * 也就是說volatile不能替代synchronized
 * @Author kyocoolcool
 * @Date 2019-07-31 21:07
 * @Version 1.0
 **/

public class T {
    volatile int count = 0;

      void  m() {
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