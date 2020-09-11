package kyocoolcool.tiger.exam1;

import java.text.DateFormat;
import java.util.Locale;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/3 下午 10:26
 **/
public class Test {
    public static void main(String[] args) {
        final DateFormat instance = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
        System.out.println(instance);
    }
}
