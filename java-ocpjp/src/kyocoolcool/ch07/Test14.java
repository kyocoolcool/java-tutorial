package kyocoolcool.ch07;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test04
 * @description
 * @date 2020/8/3 9:24 AM
 **/

public class Test14 {
//    public void aa(BlockingDeque<Integer> integers) {
//        integers.offer(103);
//        integers.offerFirst(20, 1, TimeUnit.SECONDS);
//        integers.offerLast(85, 7, TimeUnit.HOURS);
//        System.out.print(integers.pollFirst(200, TimeUnit.NANOSECONDS));
//        System.out.print(" "+integers.pollLast(1, TimeUnit.MINUTES));
//    }

    public static void main(String[] args) throws InterruptedException {
        final BlockingDeque<Integer> integers = new LinkedBlockingDeque<>();
        integers.offer(103);
        integers.offerFirst(20, 1, TimeUnit.SECONDS);
        integers.offerLast(85, 7, TimeUnit.HOURS);
        System.out.print(integers.pollFirst(200, TimeUnit.NANOSECONDS));
        System.out.print(" "+integers.pollLast(1, TimeUnit.MINUTES));
    }
}
