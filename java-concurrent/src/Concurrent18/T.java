package Concurrent18;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description 不要以字串對象作為鎖定常量，在下面例子m1,m2其實鎖定的是同一對象，
 * 這種情況還會發生比較詭異的現象，比如用到了一個類庫，在該類庫鎖定字符串"HELLO"，
 * 但是因為未讀源碼，所以在自已的代碼也鎖定"HELLO"，這時候就會發生詭異的死鎖組塞，
 * 因為自己的程式和類庫不經意使用了同一把鎖
 * @Author Chris Chen
 * @Date 2019-08-01 10:30
 * @Version 1.0
 **/
public class T {
    String s1 = "HELLO";
    String s2 = "HELLO";

    public void m1()  {
        System.out.println("m1 start");
        synchronized (s1) {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s1);
        }
        System.out.println("m1 end");
    }

    public void m2() {
        System.out.println("m2 start");
        synchronized (s2) {
            System.out.println(s2);
        }
        System.out.println("m2 end");
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m1,"t1").start();
        new Thread(t::m2,"t2").start();
    }
}