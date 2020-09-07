package special.ThreadLocaleTest;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 2:00 PM
 **/
public class Test {
    final static ThreadLocal<String> tl = new ThreadLocal<>();
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                tl.set("hello");
                System.out.println(tl.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
