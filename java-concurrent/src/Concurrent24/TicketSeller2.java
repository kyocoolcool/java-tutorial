package Concurrent24;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TicketSeller2
 * @Description 火車票有10000張票，有10個窗口販售，分析以下程序會有什麼問題?重複銷售?超量銷售?
 * 此範例使用Vector線程安全容器，保證原子操作
 * @Author kyocoolcool
 * @Date 2019-08-06 00:08
 * @Version 1.0
 **/

public class TicketSeller2 {
    static Vector<String> tickets = new Vector<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票編號: " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (tickets.size() > 0) {
                    /*若在此處有其他業務邏輯，則就無法保持原子操作*/
                    try {
                        TimeUnit.MICROSECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("銷售了--" + tickets.remove(0));
                }
            }
            ).start();
        }
    }
}