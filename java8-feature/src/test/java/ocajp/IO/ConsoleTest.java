package ocajp.IO;

import java.io.Console;
import java.io.Reader;

/**
 * @ClassName ConsoleTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-14 16:57
 * @Version 1.0
 **/

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();
        String line = console.readLine("請輸入名稱");
        char[] password = console.readPassword("請輸入密碼");
        System.out.println("您輸入的名稱:" + line);
        System.out.println("您輸入的密碼:" + new String(password));
    }
}