package kyocoolcool.exam_v1475.exam89;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 3:39 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/Users/chris/git/java-tutorial/green.txt");
        Path target = Paths.get("/Users/chris/git/java-tutorial/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }
}
