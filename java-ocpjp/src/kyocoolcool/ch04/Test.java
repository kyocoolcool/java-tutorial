package kyocoolcool.ch04;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test
 * @description
 * @date 2020/7/15 10:51 AM
 **/

public class Test {
    String a = "aaa";

    public void hello(boolean c) {
        final String b = "bbb";
        play(()->a);
        play(()->b);
        play(()->c?"ccc":"cccccccc");
    }

    public void play(Good good) {
        System.out.println(good.play());
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.hello(false);
    }
}
