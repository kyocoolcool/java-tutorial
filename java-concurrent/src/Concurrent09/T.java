package Concurrent09;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description 一個同步方法可以調用另一個同步方法，一個線程已經擁有對象的鎖，再次申請仍然會得到該對象的鎖，
 * 也就是說synchronize獲得的鎖是可以重入的
 * @Author Chris Chen
 * @Date 2019-07-24 15:07
 * @Version 1.0
 **/

public class T {
    synchronized void m1() {
        System.out.println(Thread.currentThread().getName() + ":m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println(Thread.currentThread().getName() + ":m1 end");
    }

    synchronized void m2() {
        System.out.println(Thread.currentThread().getName() + ":m2 start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(() -> t.m1(), "GO").start();
    }
}