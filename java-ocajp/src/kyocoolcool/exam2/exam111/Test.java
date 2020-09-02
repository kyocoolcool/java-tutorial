package kyocoolcool.exam2.exam111;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/24 10:02 AM
 * @Version 1.0
 **/

class A {
    public int a;
}

class B extends A {
    public int c;
}

class C extends B {
    public int c;
}

public class Test {
    public static void main(String[] args) {
        final A a = new A();
        final A b = new B();
        final A c = new C();
    }
}
