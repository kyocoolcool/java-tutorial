package kyocoolcool.exam2.exam133;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 11:49 AM
 * @Version 1.0
 **/

class C2 {
    public void displayC2() {
        System.out.println("C2");
    }
}

interface II {
    public void displayI();
}

class C1 extends C2 implements II {
    public void displayI() {
        System.out.println("C1");
    }
}

public class Test {
    public static void main(String[] args) {
        final C2 obj1 = new C1();
        final II obj2 = new C1();
        C2 s = (C2) obj2;
        II i = (II) obj1;
        s.displayC2();
        i.displayI();
    }
}
