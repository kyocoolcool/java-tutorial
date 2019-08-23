package Concurrent20;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLock2
 * @Description ReentrantLock 用來替代synchronized
 * 由於m1鎖定this,只有m1執行完畢m2,才能執行
 * 需要注意的是ReentrantLock必須手動釋放，
 * synchronized遇到exception時,JVM會自動釋放,但ReentrantLock必須手動釋放,通常加在finally後
 * 此範例利用ReentrantLock
 * @Author Chris Chen
 * @Date 2019-08-02 14:00
 * @Version 1.0
 **/

public class ReentrantLock2 {
    Lock lock = new ReentrantLock();

    void m1() {
        lock.lock();//等同於synchronize(this)
        System.out.println("m1 start");
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        System.out.println("m1 end");

    }

     void m2() {
        lock.lock();
        System.out.println("m2 start ");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        ReentrantLock2 reentrantLock1 = new ReentrantLock2();
        new Thread(reentrantLock1::m1, "t1").start();
        new Thread(reentrantLock1::m2, "t2").start();
    }
}