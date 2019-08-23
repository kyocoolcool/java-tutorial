package ocajp.collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName BlockingQueueTest
 * @Description
 * @Author Chris Chen
 * @Date 2019-06-11 18:35
 * @Version 1.0
 **/

public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        new Thread(new Put(queue), "1號生產者").start();
        new Thread(new Eat(queue), "1號消費者").start();
        new Thread(new Eat(queue), "2號消费者").start();
    }
}

class Put implements Runnable {
    private BlockingQueue<Integer> queue;

    public Put() {
    }

    public Put(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                queue.put(i);
                System.out.println("Thread(" + Thread.currentThread().getName() + ")生產了一個商品:" + i + ";當前剩餘商品" + queue.size() + "個");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class Eat implements Runnable {
    private BlockingQueue<Integer> productFactory;

    public Eat(BlockingQueue<Integer> productFactory) {
        this.productFactory = productFactory;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Thread(" + Thread.currentThread().getName() + ")消費了一個商品:" + productFactory.take() + ";當前剩餘商品" + productFactory.size() + "個");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}




