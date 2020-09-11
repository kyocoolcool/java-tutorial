package kyocoolcool.exam_v1475.exam197;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 9:24 PM
 **/
interface I {
    public void displayI();
}

class C2 {
    public void displayC2() {
        System.out.println("C2");
    }
}

class C1 extends C2 implements I {
    @Override
    public void displayI() {
        System.out.println("C1");
    }
}

public class Test {
    public static void main(String[] args) {
        C2 onj1 = new C1();
        I obj2 = new C1();
        C2 s = (C2) obj2;
        I t = (I) onj1;
        t.displayI();
        s.displayC2();
    }
}
