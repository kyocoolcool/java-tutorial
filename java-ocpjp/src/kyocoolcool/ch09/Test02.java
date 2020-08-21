package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test02
 * @description
 * @date 2020/8/12 5:08 PM
 **/

public class Test02 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/Documents/test/技能樹.PNG");
        System.out.println(Files.isDirectory(path));
        final boolean b = Files.deleteIfExists(path);
        System.out.println(b);
    }
}
