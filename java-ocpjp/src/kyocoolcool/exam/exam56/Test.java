package kyocoolcool.exam.exam56;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 上午 12:00
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("C:\\Users\\陳金昌\\Documents\\projects\\java-tutorial\\java-ocpjp\\src\\kyocoolcool\\exam");
//        final Stream<Path> list = Files.list(path);
        final Stream<Path> pathStream = Files.find(path, 1, (x, y) -> y.isDirectory(), FileVisitOption.FOLLOW_LINKS);
        pathStream.forEach(x-> System.out.println(x));
    }
}