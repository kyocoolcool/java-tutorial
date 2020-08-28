package special.test2;

import java.lang.ref.SoftReference;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 10:45 AM
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        SoftReference<Byte[]> softBean = new SoftReference<Byte[]>(new Byte[1024 * 100]);
        System.out.println(softBean.get());
        System.gc();
        Thread.sleep(1000);
        System.out.println(softBean.get());
        final Byte[] bytes = new Byte[1024 * 120];
        System.out.println(softBean.get());
    }
}
