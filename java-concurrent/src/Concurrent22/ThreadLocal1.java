package Concurrent22;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadLocal1
 * @Description 資源應加上volatile
 * @Author kyocoolcool
 * @Date 2019-08-04 15:35
 * @Version 1.0
 **/

public class ThreadLocal1 {
     volatile static Person person = new Person();

    public static void main(String[] args) {
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(person.name);
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            person.name = "李四";
        }).start();
    }
}

class Person {
    String name = "張三";
}