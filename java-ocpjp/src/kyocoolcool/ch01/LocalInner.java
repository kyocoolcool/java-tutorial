package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LocalIner
 * @description
 * @date 2020/6/20 10:43 AM
 **/

public class LocalInner {
    private int length = 5;

    public void calculator() {
        final int width = 20;
        class Inner {
            public void play() {
                System.out.println(length * width);
            }
        }
        final Inner inner = new Inner();
        inner.play();
    }

    public static void main(String[] args) {
        final LocalInner localInner = new LocalInner();
        localInner.calculator();
    }
}
