package ocajp.localization;

import org.junit.Test;

import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/**
 * @ClassName LocalizationTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-28 17:10
 * @Version 1.0
 **/

public class LocalizationTest {
    @Test
    public void test() {
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.TAIWAN);
        DateFormat dateInstance2 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        System.out.println("Taiwan:\t" + dateInstance.format(new Date()));
        System.out.println("US:\t" + dateInstance2.format(new Date()));
        NumberFormat instance = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        NumberFormat instance2 = NumberFormat.getCurrencyInstance(Locale.ITALIAN);
        System.out.println("Taiwan:\t" + instance.format(15000.45));
        System.out.println("Italan:\t" + instance2.format(15000.45));
    }
}