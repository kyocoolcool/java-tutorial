package Concurrent25;

import java.util.concurrent.SynchronousQueue;

/**
 * @ClassName SynchronousQueueTest
 * @Description SynchronousQueue:為TransferQueue特殊容器，容量為0，不能用add放法，只能用put方法(底層還是與transfer相同)
 * 一樣必須consumer先啟動
 * @Author Chris Chen
 * @Date 2019-08-08 14:18
 * @Version 1.0
 **/

public class SynchronousQueueTest {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Object> queue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

          queue.put("bbb");
//        queue.add("ccc");//Queue full

//        new Thread(() -> {
//            try {
//                System.out.println(queue.take());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
    }
}