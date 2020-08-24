package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className StaticNest
 * @description
 * @date 2020/6/20 2:57 PM
 **/

public class StaticNest {
     public static class Inner {
         public String x = "hello.txt world";

         public void good() {

         }

         public static void hi() {

         }
    }

    public static void main(String[] args) {
        final Inner inner = new Inner();
        System.out.println(inner.x);
    }
}
