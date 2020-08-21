package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FileListTest
 * @description
 * @date 2020/8/12 2:51 PM
 **/

public class FileListTest {
    public static void main(String[] args) {
//        Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/resources/test.log");
//        try {
//            Files.lines(path).forEach(System.out::println);
//        } catch (IOException e) {
//// Handle file I/O exception...
//        }

        Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/resources/test.log");
        try {
            System.out.println(Files.lines(path)
                    .filter(s -> s.startsWith("WARN "))
                    .map(s -> s.substring(5)).collect(Collectors.toList()));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
