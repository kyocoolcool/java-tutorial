package DeadLock;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description DeadLock演示
 * @Author Chris Chen
 * @Date 2019-07-24 15:21
 * @Version 1.0
 **/

public class T {
    synchronized void m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }

    synchronized void m2() {
        System.out.println("m2 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m1();
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(() -> t.m1()).start();
        new Thread(() -> t.m2()).start();
    }
}