package ocajp.thread;

import java.util.Date;

/**
 * @ClassName Lotto2
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-03 19:23
 * @Version 1.0
 **/

public class Lotto2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = (int) (Math.random() * 100);
        System.out.println("get number: " + i + "  " + new Date());
    }
}