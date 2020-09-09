package kyocoolcool.exam_v1475.exam92;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 4:34 PM
 **/
final class A1 {
     A1() {

    }
}

 class A2 {
    private static int i;
    private A2(){};
}

 abstract class A3 {
    protected static int i;

    void doStuff() {

    }

    abstract void doIt();
}

class A4 {
    protected final int i=0;

    private void doStuff() {

    }
}

abstract class A5 {
    private static int i;
    int a;

    public void doStuff() {
        System.out.println(a);
    }

    public A5(int a) {
        this.a = a;
    }
}

class A6 extends A5 {

    public A6(int a) {
        super(a);
    }
}

public class Test {

    public static void main(String[] args) {
        final A5 a5 = new A6(4);
        a5.doStuff();
    }
}
