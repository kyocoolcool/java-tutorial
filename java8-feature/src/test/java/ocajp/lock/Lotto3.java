package ocajp.lock;

import org.junit.Test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Lotto2
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-03 19:23
 * @Version 1.0
 **/

public class Lotto3 implements Runnable {
    public String username;
    public static final ReentrantLock lock = new ReentrantLock();

    public Lotto3() {
    }

    public Lotto3(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000);
                int number = (int) (Math.random() * 100);
                System.out.println(username + " 第"+i+"幾組: get number: " + number + "  " + new Date());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.execute(new Lotto3("Chris"));
        service.execute(new Lotto3("Mine"));
        service.shutdown();
    }
}