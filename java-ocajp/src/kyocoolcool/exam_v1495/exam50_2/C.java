package kyocoolcool.exam_v1495.exam50_2;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/12 1:45 PM
 * @Version 1.0
 **/

public class C extends B{
    public C() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        C test = new C();
    }
}

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A{
    public B() {
        System.out.println("B");
    }
}
