package kyocoolcool.test;

import static kyocoolcool.AAA.age;
import static kyocoolcool.AAA.call;

/**
 * @ClassName CCC
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/1 10:55 AM
 * @Version 1.0
 **/

public class CCC {
    public static void test() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(age);
        call();
    }

    public CCC() {
        System.out.println("CCC initialize");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被關掉了");
    }

    public static void main(String[] args) throws InterruptedException {
        CCC ccc = new CCC();
//        test();
        ccc = null;
        System.gc();
        while (true);
    }
}