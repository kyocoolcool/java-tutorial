package kyocoolcool.ch07;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test16
 * @description
 * @date 2020/8/3 2:07 PM
 **/

public class Test16 {
    public static void main(String[] args) {
        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        Stream.of(100.0,200.0).forEach(c-> scheduledExecutorService.submit(()-> System.out.println(c+100)));
    }
}
