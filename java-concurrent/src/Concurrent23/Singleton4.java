package Concurrent23;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName Singleton4
 * @Description 更好的方式採用此方法，使用內部類不用加鎖也實現Lazy Load
 * @Author kyocoolcool
 * @Date 2019-08-05 23:27
 * @Version 1.0
 **/

public class Singleton4 {
    public Singleton4() {
        System.out.println("singleton");
    }

    private static class Inner {
        static Singleton4 s = new Singleton4();
    }

    public static Singleton4 getSingleton() {
        return Inner.s;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[200];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> Singleton4.getSingleton());
        }
        Arrays.asList(threads).forEach(o -> o.start());
    }
}