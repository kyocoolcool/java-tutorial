package kyocoolcool.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test
 * @description
 * @date 2020/6/18 3:27 PM
 **/

public class Test {
    private static ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {
        final long executeTime = (long) (Math.random() * 10);


        //scheduleAtFixedRate
        executor.scheduleWithFixedDelay(new Runnable() {
            //			 / / Simulate time-consuming tasks, the time is any number within 10s
            @Override
            public void run() {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    System.out.print(sdf.format(new Date()) + "Start execution,");
                    Thread.sleep(3000);//3s
                    System.out.println(sdf.format(new Date()) + "End execution ================");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, 3, 5, TimeUnit.SECONDS);// every 5
    }
}
