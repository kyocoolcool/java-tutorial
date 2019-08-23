package Concurrent11;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description 程序在執行過程中，如果出現異常，鎖默認情況會被釋放
 * 所以在併發處理的過程中，有異常要多加小心，不然可能會發生不一致的情況。
 * EX:在一個web app處理過程中，多個servlet thread共同訪問同一個資源，這時如果異常處理不合適，
 * 在第一個thread中拋出異常，其他thread就會進入同步代碼區，有可能會訪問到異常產生時的數據，
 * 因此要非常小心處理同步業務邏輯中的異常。
 * @Author kyocoolcool
 * @Date 2019-07-28 10:52
 * @Version 1.0
 **/

public class T {
    int count = 0;

    synchronized void m() {
        System.out.println(Thread.currentThread().getName() + " start");
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName() + " count=" + count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5) {
                int i = 1 / 0;//此處拋出異常，所將被釋放，要想不被釋放可以在這裡catch，然後讓循環繼續。
            }
        }
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(()->t.m(),"t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->t.m(),"t2").start();

    }
}