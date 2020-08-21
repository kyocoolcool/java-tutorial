package kyocoolcool.ch05;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FormatTest
 * @description
 * @date 2020/7/22 4:07 PM
 **/

public class FormatTest {
    public static void main(String[] args) throws ParseException {
        final NumberFormat instance = NumberFormat.getInstance();
        final NumberFormat instance2 = NumberFormat.getInstance(Locale.US);
        final NumberFormat instance3 = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        int num = 123456789;
        final String format = instance.format(num);
        System.out.println(format);
        final String format1 = instance2.format(num);
        System.out.println(format1);
        final String format2 = instance3.format(num);
        System.out.println(format2);
        final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyInstance.format(48));
        String money = "TWD48.00";
        final Long parse = (Long)currencyInstance.parse(money);
        System.out.println(parse);
    }
}
