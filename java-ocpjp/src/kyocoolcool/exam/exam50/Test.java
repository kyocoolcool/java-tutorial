package kyocoolcool.exam.exam50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 6:27 PM
 **/
public class Test {
    public static void main(String[] args) {
        try {
            final List<String> strings = Files.readAllLines(Paths.get("/Users/chris/git/java-tutorial/README.md"));
            strings.stream().forEach(line -> {
                try {
                    Files.write(Paths.get("/Users/chris/git/java-tutorial/README2.md"),
                            line.getBytes(),
                            StandardOpenOption.APPEND
                    );
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
        } catch (IOException e) {
            System.out.println("exception 2");
        }
    }
}
