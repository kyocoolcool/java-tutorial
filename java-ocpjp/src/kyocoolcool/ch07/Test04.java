package kyocoolcool.ch07;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test04
 * @description
 * @date 2020/8/3 9:24 AM
 **/

public class Test04 {
    public static void main(String[] args) {
        final AtomicLong atomicLong = new AtomicLong(0);
        Long[] longArray = {0L};
        Stream.iterate(1, x -> 1).limit(100).parallel().forEach(x -> atomicLong.incrementAndGet());
        System.out.println(atomicLong);
        Stream.iterate(1, x -> 1).limit(100).forEach(x -> ++longArray[0]);
        System.out.println(longArray[0]);

    }
}
