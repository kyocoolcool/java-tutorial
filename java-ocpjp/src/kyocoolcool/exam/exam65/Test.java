package kyocoolcool.exam.exam65;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 11:35 AM
 **/

interface A {
    public default void hello() {
        System.out.println("A");
    }
}

interface B {
    public default void hello() {
        System.out.println("A");
    }
}

public class Test implements A,B{

    @Override
    public void hello() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        final A a = new Test();
        a.hello();
    }
}
