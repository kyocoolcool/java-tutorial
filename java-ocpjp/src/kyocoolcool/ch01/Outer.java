package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Outer
 * @description
 * @date 2020/6/19 5:05 PM
 **/

public class Outer {
    private String say = "hello";

   public class Inner {
       public int count = 3;

       public void countDown() {
           for (int i = 0; i < count; i++) {
               System.out.println(say+":good");
           }
       }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.countDown();
    }

    public static void main(String[] args) {
        final Outer outer = new Outer();
        outer.callInner();
    }
}

