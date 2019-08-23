package Concurrent03;

/**
 * @ClassName T
 * @Description
 * synchronized 關鍵字:對某個對象加鎖
 * @Author Chris Chen
 * @Date 2019-07-24 12:17
 * @Version 1.0
 **/

public class T {
    private int count = 10;

    /*
     * @description: 等同於synchronized (this)
     * @param
     * @return: void
     * @author: Chris Chen
     * @time: 2019-07-24 12:19
     */
    public synchronized void m() {
        count--;
        System.out.println(Thread.currentThread().getName() + "count:" + count);
    }

}