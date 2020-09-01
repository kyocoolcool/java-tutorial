package ocajp.thread;

/**
 * @ClassName ThreadTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-03 10:43
 * @Version 1.0
 **/

public class ThreadTest extends Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name+"  "+i);
        }
    }
}