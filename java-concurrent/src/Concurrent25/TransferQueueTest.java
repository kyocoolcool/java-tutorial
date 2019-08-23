package Concurrent25;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * @ClassName TransferQueueTest
 * @Description LinkedTransferQueue:高階效能併發不丟到queue內，直接轉交給接收consumer thread，但若找不到consumer則會卡住(所以消費者thread要先啟動)
 * @Author Chris Chen
 * @Date 2019-08-08 14:04
 * @Version 1.0
 **/

public class TransferQueueTest {
    public static void main(String[] args) {
        LinkedTransferQueue<Object> queue = new LinkedTransferQueue<>();
//        new Thread(() -> {
//            try {
//                System.out.println(queue.take());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();

        try {
            queue.transfer("aaa");//主要是靠transfer方法直接交給consumer thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}