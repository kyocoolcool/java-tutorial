package Concurrent16;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description synchronized 優化，同步代碼語句，越少越好
 * 比較m1,m2
 * @Author Chris Chen
 * @Date 2019-08-01 10:30
 * @Version 1.0
 **/
public class T {
    int count = 0;

    synchronized void m1() {

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++; //只有這句業務邏輯需要加鎖，這是不應該給整個方法加鎖
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void m2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            count++;
            //只有這句業務邏輯需要加鎖，這是不應該給整個方法加鎖
            //採用細膩度的鎖，可以使thread爭取時間簡短，從而提高效率
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        var date = new Date();
        /*執行方法m1,m2測試*/
        var thread1=new Thread(()->t.m2(),"t1");
        var thread2=new Thread(()->t.m2(),"t2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        var date1 = new Date();
        System.out.println(date1.getTime()-date.getTime());
    }
}