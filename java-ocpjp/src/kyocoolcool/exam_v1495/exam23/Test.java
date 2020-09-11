package kyocoolcool.exam_v1495.exam23;

import java.io.Console;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 5:17 PM
 **/
public class Test {
    public static void main(String[] args) {
         Console console = System.console();
         char[] chars = console.readPassword("Enter password:");
         String s = new String(chars);
    }
}
