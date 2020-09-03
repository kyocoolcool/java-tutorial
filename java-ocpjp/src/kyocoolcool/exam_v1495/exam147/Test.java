package kyocoolcool.exam_v1495.exam147;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 5:08 PM
 **/
public class Test {
    public static void main(String[] args) {
        final Stream<Path> pathStream = Stream.of(Paths.get("data.doc"),Paths.get("data.txt"),Paths.get("data.xml"));
        pathStream.filter(x->x.toString().endsWith("txt")).forEach(x->{
            try {
                final List<String> strings = Files.readAllLines(x);
                strings.stream().forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
