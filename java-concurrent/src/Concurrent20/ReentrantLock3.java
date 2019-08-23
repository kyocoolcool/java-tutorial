package Concurrent20;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLock3
 * @Description 使用tryLock進行嘗試性鎖定, 不管鎖定與否, 方法都將繼續執行
 * 可以根據tryLock返回值來判斷是否鎖定,
 * 也能指定tryLock的時間,由於tryLock(time)拋出異常,所以注意unlock的處理要放到finally
 * @Author Chris Chen
 * @Date 2019-08-02 14:00
 * @Version 1.0
 **/

public class ReentrantLock3 {
    Lock lock = new ReentrantLock();

    void m1() {
        lock.lock();
        System.out.println("m1 start");
        try {
            for (int i = 0; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
            System.out.println("m1 end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void m2() {
        boolean locked = false;
        System.out.println("m2 start ");
        try {
            locked = lock.tryLock(5, TimeUnit.SECONDS);
            System.out.println("m2 do..." + locked);
            if (locked) {
                System.out.println("I got it");
            }
            else {
                System.out.println("I miss it");
            }
        } catch (InterruptedException e) {
            System.out.println("m2 do2...");
        } finally {
            if (locked) lock.unlock();
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        ReentrantLock3 reentrantLock1 = new ReentrantLock3();
        new Thread(reentrantLock1::m1, "t1").start();
        new Thread(reentrantLock1::m2, "t2").start();
    }
}