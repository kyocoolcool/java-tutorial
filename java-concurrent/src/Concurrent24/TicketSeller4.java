package Concurrent24;

import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TicketSeller4
 * @Description 併發容器使用CAS(Compare And Set)效率比synchronized更高
 * @Author kyocoolcool
 * @Date 2019-08-06 00:08
 * @Version 1.0
 **/

public class TicketSeller4 {
    static ConcurrentLinkedQueue<String> tickets = new ConcurrentLinkedQueue<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票編號: " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (tickets.size() > 0) {
                    String s = tickets.poll();
                    if (s == null) {
                        break;
                    }
                    try {
                        TimeUnit.MICROSECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("銷售了--" + s);
                }
            }
            ).start();
        }
    }
}