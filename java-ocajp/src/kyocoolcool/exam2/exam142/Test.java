package kyocoolcool.exam2.exam142;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 2:03 PM
 * @Version 1.0
 **/

class A {
    public void test() {
        System.out.println("A");
    }
}

class B extends A{
    public void test() {
        System.out.println("B");
    }
}

class C extends  A {
    public void test() {
        System.out.println("C");
    }
}

public class Test {



    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        b1 =(A) b2;
        A b3 =(B) b2;
        b1.test();
        b3.test();


    }
}
