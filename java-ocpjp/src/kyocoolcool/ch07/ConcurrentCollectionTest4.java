package kyocoolcool.ch07;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ConcurrentCollectionTest
 * @description
 * @date 2020/7/30 4:44 PM
 **/

public class ConcurrentCollectionTest4 {
    public static void main(String[] args) {
        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);
            blockingDeque.push(100);
            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
            System.out.println(blockingDeque.poll(1, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
// Handle interruption
        }
    }
}
