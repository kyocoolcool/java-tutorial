package Concurrent25;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ArrayBlockingQueueTest
 * @Description ArrayBlockingQueue(有界隊列)
 * @Author Chris Chen
 * @Date 2019-08-08 10:53
 * @Version 1.0
 **/

public class ArrayBlockingQueueTest {
    static ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            try {
                queue.put("a" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.put("aaa");//直到加成功才結束
//        queue.add("aaa");//滿了會報異常
//        boolean result = queue.offer("aaa");//不會報異常，但Queue滿了也不會加進去
//        System.out.println(result);
//        queue.offer("aaa",1, TimeUnit.SECONDS);
        System.out.println(queue);
    }

}