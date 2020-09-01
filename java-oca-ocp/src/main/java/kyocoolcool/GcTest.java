package kyocoolcool;

/**
 * @ClassName GcTest
 * 
 * @Author Chris Chen
 * @Date 2019/11/14 11:06 AM
 * @Version 1.0
 **/

public class GcTest {
    private static GcTest c;
    String h;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我要回收了");
    }

    public static void main(String[] args) {
        GcTest a = new GcTest();
        GcTest b = new GcTest();
        c = new GcTest();
        a.h = "a";
        b.h = "b";
        a.h = b.h;
        System.out.println("a:" + a.h);
        System.out.println("b:" + b.h);
//        a = null;
        System.gc();
        c.h = b.h;
        System.out.println("c:" + c.h);
        b.h = null;
        System.out.println("a:" + a.h);
        System.out.println("b:" + b.h);
        System.out.println("c:" + c.h);
        b = null;
        System.gc();
        System.out.println("a:" + a.h);
        System.out.println("c:" + c.h);
//        System.gc();
//        String c = b;
//        System.out.println("c:"+c);
//        b = null;
//        System.out.println("b:"+b);
//        System.out.println("c:"+c);

    }
}