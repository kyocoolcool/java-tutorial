package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FilesWalkTest
 * @description
 * @date 2020/8/12 10:05 AM
 **/

public class FilesWalkTest {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/Documents");
//        final Stream<Path> walk = Files.walk(path, FileVisitOption.FOLLOW_LINKS);
        final Stream<Path> walk = Files.walk(path,1);
//        walk.filter(x->x.toString().endsWith(".sql")).forEach(System.out::println);
        walk.forEach(System.out::println);

//        final DirectoryStream<Path> paths = Files.newDirectoryStream(path);
//        paths.forEach(x-> System.out.println(x.toString()));

    }
}
