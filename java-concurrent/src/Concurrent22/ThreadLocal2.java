package Concurrent22;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadLocal1
 * @Description ThreadLocal:各自線程的值不與其他線程共用，是使用空間換時間，synchronized是使用時間換空間
 * 比如在Hibernate中session就存在ThreadLocal中，避免synchronized的使用
 * @Author kyocoolcool
 * @Date 2019-08-04 15:35
 * @Version 1.0
 **/

public class ThreadLocal2 {
    static ThreadLocal<Person2> tl = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tl.get());
        }).start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tl.set(new Person2());
        }).start();
    }
}

class Person2 {
    String name = "張三";
}