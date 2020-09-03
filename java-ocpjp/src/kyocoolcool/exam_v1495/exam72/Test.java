package kyocoolcool.exam_v1495.exam72;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 2:48 PM
 **/
public class Test {
    public static void main(String[] args) {
        final Path path1 = Paths.get("/software/././sys/readme.txt");
        final Path path2 = path1.normalize();
        final Path path3 = path2.relativize(path1);
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
        System.out.println(path1.getNameCount());
        System.out.println(path2.getNameCount());
        System.out.println(path3.getNameCount());

    }
}
