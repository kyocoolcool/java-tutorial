package special.test1;

import java.io.IOException;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 1:51 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.gc();
        System.out.println(m);

        System.in.read();

    }
}
