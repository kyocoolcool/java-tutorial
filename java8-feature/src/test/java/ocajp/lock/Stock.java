package ocajp.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName Stock
 * @Description 等第一個結束才會跑下一個
 * @Author Chris Chen
 * @Date 2019-06-10 14:53
 * @Version 1.0
 **/

public class Stock {
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Integer price;

    public Integer getPrice() throws InterruptedException {
        try {
            lock.readLock().lock();
            Thread.sleep(8000);
            return price;
        }  finally {
            lock.readLock().unlock();
        }
    }

    public void setPrice(Integer price) {
        try {
            lock.writeLock().lock();
            Thread.sleep(5000);
            this.price = price;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        Stock stock = new Stock();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                stock.setPrice(100);
                System.out.println("t1");
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(stock.getPrice());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2");
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                stock.setPrice(300);
                System.out.println("t3");
            }
        };
        t1.start();
        t2.start();

    }
}