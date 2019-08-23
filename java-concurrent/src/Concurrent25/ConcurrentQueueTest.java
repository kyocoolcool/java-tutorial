package Concurrent25;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ClassName ConcurrentQueueTest
 * @Description ConcurrentQueueTest 先進先出的容器
 * Deque:雙端隊列 雙向進出的容器
 * @Author kyocoolcool
 * @Date 2019-08-07 21:57
 * @Version 1.0
 **/

public class ConcurrentQueueTest {
    public static void main(String[] args) {
        Queue<String> strs = new ConcurrentLinkedQueue<>();
        for (int i = 0; i<10; i++) {
            strs.offer("a" + i);
        }
        System.out.println(strs);
        System.out.println(strs.size());
        System.out.println(strs.poll());//從容器取出一個元素
        System.out.println(strs.size());
        System.out.println(strs.peek());//讀取不從queue取出
        System.out.println(strs.size());
    }
}