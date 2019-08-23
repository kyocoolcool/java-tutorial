package Concurrent24;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TicketSeller1
 * @Description 火車票有10000張票，有10個窗口販售，分析以下程序會有什麼問題?重複銷售?超量銷售?
 * @Author kyocoolcool
 * @Date 2019-08-06 00:08
 * @Version 1.0
 **/

public class TicketSeller1 {
    static List<String> tickets = new ArrayList<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票編號: " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (tickets.size() > 0) {
                    System.out.println("銷售了--" + tickets.remove(0));
                }
            }
            ).start();
        }
    }
}