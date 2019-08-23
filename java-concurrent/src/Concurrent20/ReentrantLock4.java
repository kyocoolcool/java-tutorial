package Concurrent20;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLock4
 * @Description 使用tryLock進行嘗試性鎖定, 不管鎖定與否, 方法都將繼續執行
 * 可以根據tryLock返回值來判斷是否鎖定,
 * 也能指定tryLock的時間,由於tryLock(time)拋出異常,所以注意unlock的處理要放到finally
 * 使用ReentrantLock可以調用lockInterruptibly,可以對thread interrupt方法做出響應
 * 在一個線程等待鎖的過程,可以被打斷
 * @Author Chris Chen
 * @Date 2019-08-02 14:00
 * @Version 1.0
 **/

public class ReentrantLock4 {
    Lock lock = new ReentrantLock();

    void m1() {
        lock.lock();
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
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
        ReentrantLock4 reentrantLock1 = new ReentrantLock4();
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