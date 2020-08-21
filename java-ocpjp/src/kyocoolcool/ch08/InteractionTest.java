package kyocoolcool.ch08;

import java.io.Console;
import java.io.IOException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className InteractionTest
 * @description
 * @date 2020/8/6 2:01 PM
 **/

public class InteractionTest {
    public static void main(String[] args) throws IOException {
//        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            final String s = bufferedReader.readLine();
//            System.out.println("you input word:"+s);
//        }

//        final Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.next());

        final Console console = System.console();
        if (console == null) {
            throw new RuntimeException("not support");
        } else {
            final String s = console.readLine();
            System.out.println("i got the message:" + s);
        }
        System.out.println("hey");
    }
}
