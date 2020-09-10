package kyocoolcool.exam_v1475.exam153;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:01 AM
 **/

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
public class Test extends B{
    public Test() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        final Test test = new Test();
    }
}
