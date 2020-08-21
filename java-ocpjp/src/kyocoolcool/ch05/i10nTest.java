package kyocoolcool.ch05;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className i10nTest
 * @description
 * @date 2020/7/22 1:41 PM
 **/

public class i10nTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        final ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("en","US"));
        String value = rb.getString("work");
        System.out.println(value);
    }
}
