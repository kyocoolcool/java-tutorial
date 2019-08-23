package Concurrent05;

/**
 * @ClassName T
 * @Description 分析次程序的輸出
 * @Author Chris Chen
 * @Date 2019-07-24 13:53
 * @Version 1.0
 **/

public class T implements Runnable{
    private int count = 10;

    /*
     * @description: 加入synchronized鎖定T物件，thread照取得T物件順序，就不會產生數據同時被多thread修改
     * synchronized代碼區塊相當於原子操作不可分
     * @param
     * @return: void
     * @author: Chris Chen
     * @time: 2019-07-24 14:04
     */
    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + "count:" + count);
    }

    public static void main(String[] args) {
         T t = new T();
        for (int i = 0; i < 5; i++) {
            new Thread(t, "Thread" + i).start();
        }
    }
}