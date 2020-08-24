package kyocoolcool.exam.exam22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 5:08 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam/exam22/hello.txt");
        final Path path1 = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam/hello2.txt");
        Files.copy(path, path1);
    }
}
