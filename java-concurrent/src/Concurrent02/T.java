package Concurrent02;

/**
 * @ClassName T
 * @Description
 * synchronized 關鍵字:對某個對象加鎖
 * @Author Chris Chen
 * @Date 2019-07-24 11:39
 * @Version 1.0
 **/
public class T {
    private int count = 10;

    public void m() {
        /**要執行下方程式必須先取得this的鎖*/
        synchronized (this) {
            count--;
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }
}