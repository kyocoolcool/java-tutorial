package kyocoolcool.exam.exam52;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 6:55 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final Path file = Paths.get("/Users/chris/git/java-tutorial/README.md");
//        final Stream<String> list = Files.lines(file);
        final List<String> fc = Files.readAllLines(file);
        fc.stream().forEach(s-> System.out.println(s));
//        list.forEach(s-> System.out.println(s));

    }
}
