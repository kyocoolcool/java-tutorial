package Concurrent25;

import java.util.*;

/**
 * @ClassName SynchronizedListTest
 * @Description List+鎖
 * @Author Chris Chen
 * @Date 2019-08-07 18:12
 * @Version 1.0
 **/
public class SynchronizedListTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList();
        List<Integer> lists = Collections.synchronizedList(list);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    lists.add(new Random().nextInt(1000));
                }
            });
        }
        Arrays.asList(threads).forEach(t -> t.start());
        Arrays.asList(threads).forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("size:" + lists.size());


    }


}