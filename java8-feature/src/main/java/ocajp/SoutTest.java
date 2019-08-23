package ocajp;

/**
 * @ClassName SoutTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-07-10 16:56
 * @Version 1.0
 **/

public class SoutTest extends PrivateTest{
    public static void main(String[] args) {
        System.out.println("Result:" + 1 + 2 + 5);
        System.out.println("Result:" + 1 + 2 * 5);
    }

    public void two() {

    }

    //    class abc {
//        public void test2() {
//
//        }
//
//        abstract class bbb extends abc {
//            public void test() {
//
//            }
//
//            @Override
//            public void test2() {
//                super.test2();
//            }
//
//            abstract void test3();
//        }
//    }

}
class PrivateTest {
    public void one() { }
}