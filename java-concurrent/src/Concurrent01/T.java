package Concurrent01;

/**
 * @ClassName T
 * @Description
 * synchronized 關鍵字:對某個對象加鎖 互斥鎖
 * @Author Chris Chen
 * @Date 2019-07-24 11:39
 * @Version 1.0
 **/
public class T {
    private int count = 10;
    Object o = new Object();

    public void m() {
        /**要執行下方程式必須先取得o的鎖*/
        synchronized (o) {
            count--;
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }
}