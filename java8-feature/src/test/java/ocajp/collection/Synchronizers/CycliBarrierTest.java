package ocajp.collection.Synchronizers;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CycliBarrierTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-12 15:54
 * @Version 1.0
 **/

public class CycliBarrierTest {
    public void appointment() throws InterruptedException {
        final CyclicBarrier barrier = new CyclicBarrier(2);
        new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    System.out.println("男生到了" + new Date());
                    barrier.await();
                    System.out.println("男生說:我們一起去吃飯吧" + new Date());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("女生到了" + new Date());
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void main(String[] args) throws InterruptedException {
        new CycliBarrierTest().appointment();
    }
}