package kyocoolcool.exam.exam51;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 6:43 PM
 **/
public class Test {
    public static void main(String[] args) {
        final List<String> list = new CopyOnWriteArrayList<>();
        final AtomicInteger ai = new AtomicInteger(0);
        final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {

            @Override
            public void run() {
                System.out.println(list);
            }
        });
        final Runnable r = new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * ai.incrementAndGet());
                    list.add("X");
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

    }
}
