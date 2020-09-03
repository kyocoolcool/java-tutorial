package kyocoolcool.exam_v1495.exam186;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 09:41
 **/

class Worker extends Thread {
    CyclicBarrier cb;

    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            cb.await();
            System.out.println("Worker...");
        } catch (Exception ex) {
        }
    }
}

class Master implements Runnable { //line n1
    public void run() {
        System.out.println("Master...");
    }
}

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
    CyclicBarrier cb = new CyclicBarrier(1, master); //line n2
    Worker worker = new Worker(cb);
    worker.start();
    }
}