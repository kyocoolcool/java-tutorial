package Concurrent25;

import java.util.*;
import java.util.concurrent.*;

/**
 * @ClassName ConcurrentMapTest
 * @Description Map類型併發容器
 * @Author Chris Chen
 * @Date 2019-08-06 17:45
 * @Version 1.0
 **/

public class ConcurrentMapTest {
    static Map<String, String> map = new ConcurrentHashMap();//併發容器預設把對象分成16個部分加鎖，並不是絕對thread-safe

    public static void main(String[] args) {

//        Map<String, String> map = new ConcurrentSkipListMap();//高併發並且排序
//        Map<String, String> map = new Hashtable(); //最古老的實現，對整個對象加鎖，效率較低
//        Map<String, String> map2 = new HashMap();//可以加上帶鎖的實現 Collections.synchronizedXXX
//        Map<String, String> map = Collections.synchronizedMap(map2);//範例
//        Map<String, String> map = new TreeMap<>();
//        Random random = new Random();
        Thread[] threads = new Thread[10];
        CountDownLatch countDownLatch = new CountDownLatch(threads.length);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                cal();
                countDownLatch.countDown();
            });
        }
        Arrays.asList(threads).forEach(t -> t.start());
        try {
            countDownLatch.await();
            System.out.println("等全部thread跑完");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("size"+map.size());
    }

    public static void cal() {
        /*避免線程不安全可以加*/
//        synchronized (map) {
            Random random = new Random();
            for (int j = 0; j < 100; j++) {
                int i1 = random.nextInt(100000000);
                String s = "a" + i1;
                String s1 = map.putIfAbsent(s, s);//若重複會回傳
                if(s1!=null)
                System.out.println(s1);
            }
//        }
    }
}