package kyocoolcool.ch07;

import java.util.concurrent.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ScheduleTest
 * @description
 * @date 2020/7/28 5:33 PM
 **/

public class ScheduleTest {
    public static void main(String[] args) {
        final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        int i = 0;
        System.out.println("begin");
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(() -> System.out.println("i:" + i + 1), 10, TimeUnit.SECONDS);
        final ScheduledFuture<String> schedule2 = scheduledExecutorService.schedule(() -> {
            System.out.println("monkey start");
            return "monkey";}, 5, TimeUnit.SECONDS);
        final ScheduledFuture<String> schedule3 = scheduledExecutorService.schedule(() -> {
            System.out.println("dog start");
            return "dog";}, 1, TimeUnit.SECONDS);
        System.out.println("end");
        try {
            final String ss = schedule3.get();
            System.out.println(ss);
            final String s = schedule2.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
