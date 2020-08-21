package kyocoolcool.ch08;

import java.io.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className PrintWriter
 * @description
 * @date 2020/8/6 11:42 AM
 **/

public class PrintWriterTest {
    public static void main(String[] args) throws IOException {
        File source = new File("/Users/chris/git/java-tutorial/java-ocpjp/resources/zoo.log");
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(source)))) {
            out.print("Today's weather is: ");
            out.println("Sunny");
            out.print("Today's temperature at the zoo is: ");
            out.print(1 / 3.0);
            out.println('C');
            out.format("It has rained 10.12 inches this year");
            out.println();
            out.printf("It may rain 21.2 more inches this year");
        }
    }
}
