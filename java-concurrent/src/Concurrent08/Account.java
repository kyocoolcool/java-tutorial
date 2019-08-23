package Concurrent08;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Account
 * @Description 經典銀行考題
 * 對業務寫方法加鎖
 * 對業務讀方法不加鎖
 * 容易產生dirtyRead問題:寫的邏輯未完成時，讀到的是未完成的數據
 * @Author Chris Chen
 * @Date 2019-07-24 14:40
 * @Version 1.0
 **/

public class Account {
    String name;
    double balance;

    public synchronized void set(String name, double balance) {
        this.name = name;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public /**synchronized*/ double getBalance(String name) {
        System.out.println("我是"+name+":");
        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        new Thread(() -> account.set("小白", 100.0)).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getBalance("小白"));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getBalance("小白"));
    }
}