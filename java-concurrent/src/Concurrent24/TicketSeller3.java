package Concurrent24;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TicketSeller3
 * @Description 加上synchronized保證只能單一線程擁有資源，但是效率不佳
 * @Author kyocoolcool
 * @Date 2019-08-06 00:08
 * @Version 1.0
 **/

public class TicketSeller3 {
    static Vector<String> tickets = new Vector<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票編號: " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                synchronized (tickets) {
                    while (tickets.size() > 0) {
                        try {
                            TimeUnit.MICROSECONDS.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("銷售了--" + tickets.remove(0));
                    }
                }
            }
            ).start();
        }
    }
}