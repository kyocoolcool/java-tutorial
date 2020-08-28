package kyocoolcool.exam.exam149;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 5:48 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        int maxDepth = 2;
        Stream<Path> paths = Files.find(Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/special/sports"),
                maxDepth, (p, a) -> p.getFileName().toString().endsWith("txt"),
                FileVisitOption.FOLLOW_LINKS);
        Long fCount = paths.count();
        System.out.println(fCount);
    }
}
