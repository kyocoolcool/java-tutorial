package kyocoolcool.exam_v1495.exam9;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 5:59 PM
 **/
public class Test {
    public static void main(String[] args) {
        double d = 15;
        final Locale locale = new Locale("en", "US");
        final NumberFormat instance = NumberFormat.getCurrencyInstance(locale);
        final String format = instance.format(d);
        System.out.println(format);
    }
}
