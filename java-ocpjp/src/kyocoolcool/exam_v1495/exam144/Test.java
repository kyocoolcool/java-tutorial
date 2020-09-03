package kyocoolcool.exam_v1495.exam144;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 4:34 PM
 **/

class MyClass extends Thread implements Runnable {
    public int value;
    @Override
    public synchronized void run() {
        while (value < 100) {
            value++;
            System.out.println(Thread.currentThread().getName()+":  value:" + value);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        final MyClass myClass = new MyClass();
        new Thread(myClass,"First").start();
        new Thread(myClass,"Second").start();
    }
}
