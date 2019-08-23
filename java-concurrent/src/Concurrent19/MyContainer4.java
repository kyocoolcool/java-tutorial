package Concurrent19;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyContainer4
 * @Description t1 notify t2後，自己先wait讓t2運行，t2運行完畢後notify t1
 * @Author Chris Chen
 * @Date 2019-08-01 16:58
 * @Version 1.0
 **/

public class MyContainer4 {
    volatile List list = new ArrayList();

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyContainer4 c = new MyContainer4();
        final Object o = new Object();
        new Thread(() -> {
            synchronized (o) {
                System.out.println("t2 start");
                try {
                    if (c.size() != 5)
                        o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 end");
                o.notify();
            }

        }, "t2").start();

        new Thread(() -> {
            System.out.println("t1 start");
            synchronized (o) {
                for (int i = 0; i < 10; i++) {
                    c.add(new Object());
                    System.out.println("add " + i);
                    if (c.size() == 5) {
                        o.notify();
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t1 end");
            }
        }, "t1"
        ).start();


    }

}