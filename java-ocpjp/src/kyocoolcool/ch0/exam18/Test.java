package kyocoolcool.ch0.exam18;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:46 PM
 **/
public class Test {
    public static void main(String[] args) {
        Set<? extends RuntimeException> set = new HashSet<NullPointerException>();
    }
}
