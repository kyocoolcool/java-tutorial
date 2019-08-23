package Concurrent19;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyContainer3
 * @Description 這裡使用wait和notify做到，wait會釋放鎖，notify不會釋放鎖
 * 需要注意的是運用此方法必須先讓t2先執行監聽
 * 分析以下結果
 * 不是size5時t2退出，而是t1結束時t2才退出
 * @Author Chris Chen
 * @Date 2019-08-01 16:58
 * @Version 1.0
 **/

public class MyContainer3 {
    volatile List list = new ArrayList();

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyContainer3 c = new MyContainer3();
        final Object o = new Object();
        new Thread(() -> {
            synchronized (o) {
                System.out.println("t2 start");
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 end");
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