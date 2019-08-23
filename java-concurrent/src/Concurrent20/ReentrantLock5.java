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
 * ReentrantLock可以指定為公平鎖
 * @Author Chris Chen
 * @Date 2019-08-02 14:00
 * @Version 1.0
 **/

public class ReentrantLock5 {
    Lock lock = new ReentrantLock(true);//參數為true開啟公平鎖

    void m1() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + ": " + i);
            lock.unlock();
        }
        System.out.println(Thread.currentThread().getName() + ": m1 end");

    }

    public static void main(String[] args) {
        ReentrantLock5 reentrantLock1 = new ReentrantLock5();
        new Thread(reentrantLock1::m1, "t1").start();
        new Thread(reentrantLock1::m1, "t2").start();
    }
}