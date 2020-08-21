package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ListTest
 * @description
 * @date 2020/8/12 2:16 PM
 **/

public class ListTest {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src");
        final Stream<Path> list = Files.list(path);
        final Stream<Path> pathStream = list.map(p -> p.toAbsolutePath());
        pathStream.forEach(p-> System.out.println(p));
    }
}
