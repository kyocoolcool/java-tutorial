package kyocoolcool.exam_v1475.exam64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 9:43 AM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final Stream<Path> list = Files.list(Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam_v1475/exam64/test2"));
        list.forEach(System.out::println);


//        stream.forEach(System.out::println);
    }
}
