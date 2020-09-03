package kyocoolcool.exam_v1495.exam20;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 4:50 PM
 **/
public class Test {
    public static void main(String[] args) {
        final Path path1 = Paths.get("/app/./sys/");
        final Path res1 = path1.resolve("log");
        final Path path2 = Paths.get("/server/exe/");
        final Path res2 = path2.resolve("readme/");
        System.out.println(res1);
        System.out.println(res2);
    }
}
