package AtomVisibility;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName T
 * @Description Atom可見性證明
 * @Author kyocoolcool
 * @Date 2019-07-31 21:07
 * @Version 1.0
 **/

public class T {

    AtomicBoolean flag = new AtomicBoolean();

    void m() {
        System.out.println("m start");
        flag.set(true);
        while (flag.get()) {

        }
        System.out.println("m stop");
    }


    public static void main(String[] args) {

        System.out.println("main start");
        var t = new T();
        new Thread(() -> t.m(), "t1").start();
        System.out.println("main end");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.flag.set(false);
    }

}