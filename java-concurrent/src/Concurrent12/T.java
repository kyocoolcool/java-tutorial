package Concurrent12;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description volatile 關鍵字，使一個變量在多個thread可見，
 * A,B thread 都用到一個變量，Java默認是A thread中保留一份copy，這樣如果B thread修改了該變量，則A Thread 未必知道，
 * 使用volatile關鍵字，會讓所有thread都會讀到變量的修改值。
 * 在下面的代碼中，running是存在於堆內存中讀到t1 thread的工作區，在運行過程中直接使用這個copy，並不會每次都去讀堆內存，
 * 這樣當主thread修改running的值後，t1 thread感知不到，所以不會停止運行。
 * 使用volatile，將會強制所有thread都去堆內存中讀取running的值。
 * <p>
 * 可以閱讀這邊文章進行更深入的理解
 * http://www.cnblogs.com/nexiyi/p/java_momory_model_and_thread.html
 * <p>
 * volatile並不能保證多個thread共同修改running變量時所帶來的不一致問題，也借勢說volatile不能代替synchronized
 * @Author kyocoolcool
 * @Date 2019-07-28 11:14
 * @Version 1.0
 **/

public class T {
    public /* volatile */  Boolean running = true;

    public void m() {
        System.out.println("start");
        while (running) {

        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        T t = new T();
        new Thread(t::m, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
        System.out.println("main end");
    }
}