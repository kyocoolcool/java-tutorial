package Concurrent25;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName CopyOnWriteListTest
 * @Description 寫時複製容器:寫的效率低，但讀的效率高
 * @Author Chris Chen
 * @Date 2019-08-07 16:38
 * @Version 1.0
 **/

public class CopyOnWriteListTest {
    public static long caculator(Thread[] threads) {
        long start = System.currentTimeMillis();
        Arrays.asList(threads).forEach(o -> o.start());
        Arrays.asList(threads).forEach(o -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {
        List<String> list =
                new CopyOnWriteArrayList<>();
//        new ArrayList<>();//併發會有問題沒有鎖線程不安全
//                new Vector<>();
        Random random = new Random();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add("a" + random.nextInt(10000));
                }
            });
        }

        long result = caculator(threads);
        System.out.println(result);
        System.out.println("size:" + list.size());
    }

}