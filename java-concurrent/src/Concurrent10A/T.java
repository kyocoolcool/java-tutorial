package Concurrent10A;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyContainer1
 * @Description 一個同步方法可以調用另外一個同步方法，一個thread已經擁有某個對象的鎖，再次申請的時候仍然會得到該對象的鎖，
 * 也就是說synchronized獲得的鎖事可重入的，這裡是繼承中有可能發生的情形，子類調用父類的同步方法
 * @Author Chris Chen
 * @Date 2019-07-25 11:36
 * @Version 1.0
 **/

public class T {

    synchronized void m() {
        System.out.println("m start");
        TT tt = new TT();
        tt.m();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }


    public static void main(String[] args) {
        new T().m();

    }

}

class TT extends T {
    @Override
    synchronized void m() {
        System.out.println("mm start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mm end");
    }
}