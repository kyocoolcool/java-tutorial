package Concurrent20;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLock4
 * @Description lockInterruptibly若拿到鎖就能繼續運行
 * @Author Chris Chen
 * @Date 2019-08-02 14:00
 * @Version 1.0
 **/

public class ReentrantLock4A {
    Lock lock = new ReentrantLock();

    void m1() {
        lock.lock();
        System.out.println("m1 start");
        lock.unlock();
        System.out.println("m1 end");
    }

    void m2() {
        System.out.println("m2 start ");
        /* lock.lock(); */
        boolean flag = false;
        try {
        lock.lockInterruptibly();
            flag = true;
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("m2 InterruptedException");
        } finally {
           if(flag)lock.unlock();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        ReentrantLock4A reentrantLock1 = new ReentrantLock4A();
        new Thread(reentrantLock1::m1, "t1").start();
        Thread t2=new Thread(reentrantLock1::m2, "t2");
        t2.start();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();
    }
}