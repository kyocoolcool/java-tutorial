package ocajp.GC;

import java.util.TreeSet;

/**
 * @ClassName finalizeTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-11 10:03
 * @Version 1.0
 **/

public class finalizeTest {
    static int count;

    public finalizeTest() {
        ++count;
    }

    public static void main(String[] args) throws InterruptedException {
        finalizeTest finalizeTest1 = new finalizeTest();
        finalizeTest finalizeTest2 = new finalizeTest();
        finalizeTest finalizeTest3 = new finalizeTest();
        System.out.println("目前有:" + count + "個物件實體");
        finalizeTest2 = null;
        System.out.println("建議啟動資源回收機制");
        System.gc();
//        Runtime.getRuntime().gc();
        Thread.sleep(1000);
        System.out.println("目前剩餘" + count + "個物件實體");
        /**建議執行應該finalize()的物件*/
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        --count;
        String name = Thread.currentThread().getName();
        System.out.println("正在執行finalize()的是" + name);
    }
}