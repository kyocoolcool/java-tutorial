package Concurrent20;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ReentrantLock1
 * @Description ReentrantLock 用來替代synchronized
 * 由於m1鎖定this,只有m1執行完畢m2,才能執行
 * 此範例利用synchronized
 * @Author Chris Chen
 * @Date 2019-08-02 14:00
 * @Version 1.0
 **/

public class ReentrantLock1 {
    synchronized void m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1 end");
    }

    synchronized void m2() {
        System.out.println("m2 start ");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        ReentrantLock1 reentrantLock1 = new ReentrantLock1();
        new Thread(reentrantLock1::m1, "t1").start();
        new Thread(reentrantLock1::m2, "t2").start();
    }
}