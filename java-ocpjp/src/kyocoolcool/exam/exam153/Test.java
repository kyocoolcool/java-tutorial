package kyocoolcool.exam.exam153;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/30 下午 04:35
 **/
public class Test {
    public static void main(String[] args) {
        Locale currentLocale;
//        currentLocale=new Locale("de","DE");
//        currentLocale=new Locale.Builder().setLanguage("de").setRegion("DE").build();
        currentLocale = Locale.getDefault();

        final ResourceBundle message = ResourceBundle.getBundle("message", currentLocale);
        final String inquiry = message.getString("inquiry");
        System.out.println(inquiry);
    }
}