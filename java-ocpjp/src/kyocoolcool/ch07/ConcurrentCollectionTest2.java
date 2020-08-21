package kyocoolcool.ch07;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ConcurrentCollectionTest
 * @description
 * @date 2020/7/30 4:44 PM
 **/

public class ConcurrentCollectionTest2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        queue.offer(10);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        deque.push(8);
        deque.push(4);
        deque.offer(50);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
        System.out.println(deque.getLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
    }
}
