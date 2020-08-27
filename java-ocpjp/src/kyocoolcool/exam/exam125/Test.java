package kyocoolcool.exam.exam125;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 上午 12:32
 **/
public class Test {
    public static void main(String[] args) {
        final Locale locale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
        final ResourceBundle message = ResourceBundle.getBundle("Message", locale);
        final Enumeration<String> keys = message.getKeys();
        while (keys.hasMoreElements()) {
            final String key = keys.nextElement();
            final String value = message.getString(key);
            System.out.println("key:"+key+",value:"+value);
        }


    }
}