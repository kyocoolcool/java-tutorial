package Concurrent07;

/**
 * @ClassName T
 * @Description t2運行不需要鎖
 * @Author Chris Chen
 * @Date 2019-07-24 14:18
 * @Version 1.0
 **/

public class T {

    public synchronized void m1() {
        System.out.println(Thread.currentThread().getName()+":m1 start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":m1 end");
    }

    public void m2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":m2 do");
    }

    public static void main(String[] args) {
         T t = new T();
         new Thread(()->t.m1(),"m1").start();
         new Thread(()->t.m2(),"m2").start();
         /**
          * 等同於
          *  new Thread(t::m1).start();
          *  new Thread(t::m2).start();
          */
    }
}