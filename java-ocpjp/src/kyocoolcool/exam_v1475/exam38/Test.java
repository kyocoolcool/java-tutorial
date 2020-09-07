package kyocoolcool.exam_v1475.exam38;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 3:20 PM
 **/
class Test2 {
    private void init() {
        System.out.println("init");
    }

    public void start() {
        init();
        System.out.println("start");
    }
}
public class Test {
    public static void main(String[] args) {
        final Test2 test2 = new Test2();
        test2.start();
    }
}
