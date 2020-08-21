package kyocoolcool.exam2.exam89;

/**
 * @ClassName C1
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/23 11:42 PM
 * @Version 1.0
 **/
interface I {
    public void displayI();
}

abstract class C2 implements I {
    public void displayC2() {
        System.out.println("C2");
    }
}

public class C1 extends C2 {
    @Override
    public void displayI() {
        System.out.println("C1");
    }

    public static void main(String[] args) {
        final C1 obj1 = new C1();
        final C1 obj2 = new C1();

        final C2 s =(C2) obj2;
        I t = obj1;
        s.displayI();
        s.displayC2();
        t.displayI();

    }
}
