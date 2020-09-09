package kyocoolcool.exam_v1475.exam88;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 3:22 PM
 **/
interface P {
    public void method1();
}

interface Q extends P {
    public void method1();
}

interface R extends P {
    public void method2();
}

interface S {
    public default void method() {
    }

    ;
}

interface T {
    public default void method1() {
    }

    ;

    public default void method2() {
    }

    ;
}

interface U {
    public void method1();

    public abstract void method12();
}

public class Test {
    public static void main(String[] args) {
//        P p=()->System.out.println("aaa");
//        p.method1();
        Q q = () -> System.out.println("aaa");
        q.method1();
    }
}
