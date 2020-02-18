package kyocoolcool.exam.exam82;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/17 3:19 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final Test1 test1 = new Test1();

    }
}

class Test1 {
    private void a() {
        System.out.println("a");
    }

    private void b() {
        a();
        System.out.println("b");
    }
}
