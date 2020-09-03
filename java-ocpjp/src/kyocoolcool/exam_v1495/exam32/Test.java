package kyocoolcool.exam_v1495.exam32;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 1:50 PM
 **/
public class Test {
    public static void main(String[] args) {
        int i;
        char c;
        try (FileInputStream fis = new FileInputStream("course.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            while (true) { //line n1
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
