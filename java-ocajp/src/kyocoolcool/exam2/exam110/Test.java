package kyocoolcool.exam2.exam110;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 12:44 AM
 * @Version 1.0
 **/
class Base {
    public void test() {
        System.out.println("Base");
    }
}

class A extends Base {
    public void test() {
        System.out.println("A");
    }
}

class B extends A{
    public void test() {
        System.out.println("B");
    }
}

public class Test {
    public static void main(String[] args) {
        Base b1 = new B();
         Base b2 = new A();
         Base b3 = new B();
        Base b4 = b3;
        b1 = (Base) b2;
        b1.test();
        b4.test();


    }
}
