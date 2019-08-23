package Concurrent25;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName DelayQueueTest
 * @Description DelayQueue:Queue中每個元素都計算著時間，等時間到才能取出，等最久的先拿
 * @Author Chris Chen
 * @Date 2019-08-08 11:23
 * @Version 1.0
 **/

public class DelayQueueTest {
    static DelayQueue queue = new DelayQueue();
    static Random random = new Random();

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        MyTsak myTsak1 = new MyTsak(now + 600);
        MyTsak myTsak2 = new MyTsak(now + 300);
        MyTsak myTsak3 = new MyTsak(now + 100);
        MyTsak myTsak4 = new MyTsak(now + 1000);
        MyTsak myTsak5 = new MyTsak(now + 500);
        queue.put(myTsak1);
        queue.put(myTsak2);
        queue.put(myTsak3);
        queue.put(myTsak4);
        queue.put(myTsak5);
        System.out.println(queue);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class MyTsak implements Delayed {
    long runnintTime;

    public MyTsak(long rt) {
        this.runnintTime = rt;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.runnintTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long td = this.getDelay(TimeUnit.MILLISECONDS);
        long od = o.getDelay(TimeUnit.MILLISECONDS);
        return td > od ? 1 : td == od ? 0 : -1;
    }

    @Override
    public String toString() {
        return " " + runnintTime;
    }
}