package kyocoolcool.exam.exam119;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 下午 09:56
 **/
public class Counter extends Thread {
    int i = 10;

    public  void display(Counter obj) {
//        try {
//            Thread.sleep(5000);
            obj.increament(this);
            System.out.println(i);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
    }

    private  void increament(Counter counter) {
        i++;
    }

    public static void main(String[] args) {
        final Counter counter = new Counter();
        final Counter counter2 = new Counter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                counter.display(counter2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                counter2.display(counter);
            }
        }).start();
    }
}