package Concurrent17;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description 鎖定某個對象o，如果o的屬性改變，不影響鎖的使用
 * 但是如果o變成另外一個對象，與鎖定的對象發生改變
 * 應該盡量避免將鎖定對象的引用變成另外的對象
 * @Author Chris Chen
 * @Date 2019-08-01 10:30
 * @Version 1.0
 **/
public class T {
    Object o = new Object();

    void m() {
        synchronized (o) {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        new Thread(() -> t.m(), "t1").start();
        TimeUnit.SECONDS.sleep(10);
        t.o = new T();
        new Thread(() -> t.m(), "t2").start();
    }
}