package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test16
 * @description
 * @date 2020/8/13 4:37 PM
 **/

public class Test16 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/Documents/test/test.csv");
        final Stream<String> lines = Files.lines(path);
//        lines.flatMap(p->Stream.of(p.split(","))).map(p->p.toUpperCase()).forEach(System.out::println);
        lines.flatMap(x->Stream.of(x.toUpperCase().split(","))).forEach(System.out::println);
    }
}
