package kyocoolcool.exam_v1495.exam195;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 11:19
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get ("course.txt");
//        final List<String> strings = Files.readAllLines(file);
//        strings.stream().forEach(System.out::println);
        final Stream<String> lines = Files.lines(file);
        lines.forEach(System.out::println);
    }
}