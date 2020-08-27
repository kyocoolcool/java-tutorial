package special.test1;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 1:51 PM
 **/
public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("close");
    }
}
