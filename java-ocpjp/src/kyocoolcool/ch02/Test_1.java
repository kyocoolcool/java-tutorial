package kyocoolcool.ch02;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test_1
 * @description
 * @date 2020/6/22 10:14 AM
 **/

public class Test_1 extends Test{
    @Override
    public void test()  {
        System.out.println("test_1");
    }

    public static void main(String[] args) {
        final Test test_1 = new Test_1();
        try {
            test_1.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
