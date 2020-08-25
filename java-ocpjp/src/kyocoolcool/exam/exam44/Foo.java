package kyocoolcool.exam.exam44;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 5:19 PM
 **/
public class Foo {
    public void methodB(String s) {
        System.out.println("Foo " + s);
    }

    static  class Bar extends Foo {
        public void methodB(String s) {
            System.out.println("Bar " + s);
        }
    }

   static class Baz extends Bar {
        public void methodB(String s) {
            System.out.println("Baz " + s);
        }
    }

    static class Daze extends Baz {
        private Bar bb = new Bar();
        public void methodB(String s) {
            bb.methodB(s);
            super.methodB(s);
        }
    }

    public static void main(String[] args) {
        final Baz d = new Daze();
        d.methodB("Hello");
    }

}
