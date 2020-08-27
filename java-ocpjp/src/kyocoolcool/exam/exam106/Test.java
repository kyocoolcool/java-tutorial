package kyocoolcool.exam.exam106;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 11:33 AM
 **/
public class Test {
    public static void main(String[] args) {
        final ResourceBundle message = ResourceBundle.getBundle("Message", Locale.US);
        final Object object = message.getObject("welcome1");
        System.out.println(object.toString());
    }
}
