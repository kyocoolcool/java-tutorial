package kyocoolcool.exam.exam130;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 11:24 AM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/chris/git/java-tutorial/version.txt"))) {
            final boolean ready = br.ready();
            System.out.println(ready);
            String s = br.readLine();
            System.out.println(s);
            brCopy = br;
            String s1 = brCopy.readLine();
            System.out.println(s1);
//            brCopy.lines().forEach(c -> System.out.println("second:"+c));
        }
//        brCopy.ready(); //line n3;
    }
}
