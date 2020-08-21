package kyocoolcool.ch07;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ScheduleRateTest
 * @description
 * @date 2020/7/28 5:57 PM
 **/

public class ScheduleRateTest {
    public static void main(String[] args) {
        final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        AtomicInteger i = new AtomicInteger();
        System.out.println("begin:"+LocalTime.now());
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
                    System.out.println("開始時間:"+LocalTime.now());
                    System.out.println("i:" + String.valueOf(i.getAndIncrement()));
                    try {
                        Thread.sleep(5000);
                        System.out.println("睡醒時間:"+LocalTime.now());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                , 5, 3, TimeUnit.SECONDS);
    }
}
