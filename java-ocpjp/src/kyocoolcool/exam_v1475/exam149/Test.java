package kyocoolcool.exam_v1475.exam149;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:36 AM
 **/
public class Test {
    public static void main(String[] args) {
        Stream<Path> paths = Stream.of(Paths.get("data.doc"), Paths.get("data.txt"), Paths.get("data.xml"));
        paths.filter(s -> s.toString().endsWith("txt")).forEach(
                s -> {
                    try {
                        Files.readAllLines(s)
                                .stream()
                                .forEach(System.out::println); //line n1
                    } catch (IOException e) {
                        System.out.println("Exception");
                    }
                }
        );
    }
}
