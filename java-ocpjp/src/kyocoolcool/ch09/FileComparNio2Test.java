package kyocoolcool.ch09;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FileComparNio2Test
 * @description
 * @date 2020/8/12 3:11 PM
 **/

public class FileComparNio2Test {
    public static void main(String[] args) {
        final File file = new File("/Users/chris/git/java-tutorial/java-ocpjp/resources/test.log");
        System.out.println(file.isFile());
        final Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/resources/test.log");
        System.out.println(Files.isRegularFile(path));
    }
}
