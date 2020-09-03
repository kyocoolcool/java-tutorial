package kyocoolcool.exam_v1495.exam113;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/20 2:21 PM
 * @Version 1.0
 **/

public class Test {
    public void a() throws Exception{
        System.out.println("a");
    }

    public void b() throws RuntimeException {
        System.out.println("b");
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.b();
        try {
            test.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
