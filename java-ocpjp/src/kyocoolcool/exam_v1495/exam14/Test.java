package kyocoolcool.exam_v1495.exam14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 2:09 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
//        final Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam/exam14");
//        final Stream<Path> pathStream = Files.find(path, 1, (path2, basicFileAttributes) -> path2.toString().endsWith(".txt")|| path2.toString().endsWith(".java"));
//        pathStream.forEach(System.out::println);
        final Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam/exam14/doc.txt");
        final Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);

    }
}
