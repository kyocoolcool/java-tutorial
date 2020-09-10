package kyocoolcool.exam_v1475.exam146;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:30 AM
 **/
public class Test {
    public static void main(String[] args) {
        final Path path = Paths.get("software/../../sys/readme.txt");
        final Path path2 = path.normalize();
        final Path path3 = path2.relativize(path);
        System.out.println(path.getNameCount());
        System.out.println(path2.getNameCount());
        System.out.println(path3.getNameCount());
    }
}
