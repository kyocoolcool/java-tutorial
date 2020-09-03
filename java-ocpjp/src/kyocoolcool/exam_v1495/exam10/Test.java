package kyocoolcool.exam_v1495.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 6:10 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter GDP");
//        final int i = Integer.parseInt(bufferedReader.readLine());
//        final int i = bufferedReader.read();
        final Stream<String> lines = bufferedReader.lines();
        lines.forEach(System.out::println);
    }
}
