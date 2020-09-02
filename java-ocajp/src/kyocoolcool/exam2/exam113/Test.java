package kyocoolcool.exam2.exam113;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 10:06 AM
 * @Version 1.0
 **/

public class Test {
    public void testA() throws Exception{
        System.out.println("A");
    }

    public void testB() throws RuntimeException {
        System.out.println("B");
    }

    public static void main(String[] args) {
        final Test test = new Test();
//        test.testA();
        test.testB();
    }
}
