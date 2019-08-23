package myjava8;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName ResourceBundleTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-28 17:29
 * @Version 1.0
 **/

public class ResourceBundleTest {

    public static void main(String[] args) {
        show(new Locale("zh", "TW"));
        show(new Locale("en", "US"));
//        show1();
    }

    public static void show(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",locale);
        System.out.println(bundle.getString("HELLO"));
    }

    public static void show1() {
        ResourceBundle bundle = ResourceBundle.getBundle("Projects");
        System.out.println(bundle.getString("BYE"));
    }
}