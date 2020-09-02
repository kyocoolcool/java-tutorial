package kyocoolcool.exam.exam93;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/17 5:47 PM
 * @Version 1.0
 **/

public class Test extends A{
    @Override
    public void test() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
         A b1 = new A();
         A b2 = new Test();
        b1 = (A) b2;
        A b3 =(B) b2;
        b1.test();
        b3.test();

    }
}

class A {
    public void test() {
        System.out.println("A");
    }
}

class B extends A{
    @Override
    public void test() {
        System.out.println("B");
    }
}
