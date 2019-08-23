package Concurrent21;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyContainer1
 * @Description 寫個固定容量同步容器, 有put, get, count方法
 * 支持2個thread provider,10個thread consumer的阻塞調用
 * 使用wait/notify/notify all
 * @Author Chris Chen
 * @Date 2019-08-02 16:52
 * @Version 1.0
 **/

public class MyContainer1<T> {
    final private LinkedList<T> list = new LinkedList<>();
    final private int MAX = 10;//最多10個元素
    private int count = 0;

    public synchronized void put(T t) {

        while (list.size() == MAX) {//想想為什麼用while不是用if,原因是若用if,notify直接往下執行,
            // 其他線程先執行的話,就會出錯,無論是provider,consumer
            // 若用while可以多判斷一次條件確保
            try {
                this.wait();//effective java
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(t);
        ++count;
        this.notifyAll();//通知消費者thread進行消費
    }

    public synchronized T get() {
        T t = null;
        while (list.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t = list.removeFirst();
        count--;
        this.notifyAll();//通知生產者進行生產
        return t;
    }

    public static void main(String[] args) {
        MyContainer1<String> c = new MyContainer1<>();
        for (int i = 0; i < 10; i++) {
            c.put("預放" + i);
        }


        //啟動消費者線程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    System.out.println("消費" + c.get());
                }
            }, "c" + i).start();
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 25; j++) {
                    c.put(Thread.currentThread().getName() + "  " + j);
                }
            }, "p" + i).start();
        }
        while (true) {
            System.out.println("容器數量:" + c.count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}