package kyocoolcool.exam.exam26;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 6:14 PM
 **/
public class  Test implements Runnable {
    private String[] src = {"a", "b", "c"};
    private int count = 0;
    Apple apple = new Apple();
    Lock lock = new ReentrantLock();

//    @Override
//    public  void run() {
//        while (count < src.length) {
////            synchronized (Test.class) {
////            lock.lock();
//                    System.out.println(src[count] + " " + Thread.currentThread().getName());
//                    count++;
////                    lock.unlock();
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    System.out.println("error");
//                }
////            }
//        }
//    }


    @Override
    public void run(){
        try {
            hello(apple);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private  synchronized  void hello(Apple apple) throws InterruptedException {
//        synchronized (apple) {
            if (Thread.currentThread().getName().equals("AAA")) {
                apple.setName("aaaa");
            }if (Thread.currentThread().getName().equals("BBB")) {
                apple.setName("bbbb");
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(apple);
            Thread.sleep(3000);
//        }
    }

    public static void main(String[] args) {
        final Test test = new Test();
        final Test test2 = new Test();
        final Thread thread1 = new Thread(test, "AAA");
        final Thread thread2 = new Thread(test2, "BBB");
//         (test) {
//        synchronized (test) {
            thread2.start();
//        }
        System.out.println("aaa");
//        synchronized (test) {
            thread1.start();
//        }
//        }



    }
}
