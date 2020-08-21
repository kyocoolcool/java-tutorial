package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test12
 * @description
 * @date 2020/6/20 5:47 PM
 **/

public class Test12 {
    String x = "Test12";

    static class Good {
        public void hello() {
            System.out.println("Good");
        }
    }

    static class GoodGood extends Good {
        @Override
        public void hello() {
            System.out.println("GoodGood");
        }
    }

    public void hi() {
        System.out.println("hi");
    }

    static class GoodGoodGood extends Test12 {
        @Override
        public void hi() {
            System.out.println("hihi");
        }
    }
    public static void main(String[] args) {
        final Good good = new GoodGood();
        good.hello();

        final Test12 goodGoodGood = new GoodGoodGood();
        System.out.println(goodGoodGood.x);
        goodGoodGood.hi();
    }
}
