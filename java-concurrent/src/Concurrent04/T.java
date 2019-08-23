package Concurrent04;

/**
 * @ClassName T
 * @Description
 * synchronized 關鍵字:對某個對象加鎖
 * @Author Chris Chen
 * @Date 2019-07-24 12:17
 * @Version 1.0
 **/

public class T {
    private static int count = 10;

    /**
     * @description: 若是synchronized加在static相當於synchronized(MyContainer1.class)
     * @param
     * @return: void
     * @author: Chris Chen
     * @time: 2019-07-24 12:22
     */
    public synchronized static void m() {
        count--;
        System.out.println(Thread.currentThread().getName() + "count:" + count);
    }

    public static void mm() {
        synchronized (T.class) {
            count--;
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }

}