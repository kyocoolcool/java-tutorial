package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test11
 * @description
 * @date 2020/8/13 3:31 PM
 **/

public class Test11 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/Documents/test/hello/技能樹.PNG");
        final Path path2 = Paths.get("/Users/chris/Documents/test/aaaa/tree.PNG");
        final Path copy = Files.copy(path, path2, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println(Files.isSameFile(path,path2));
    }
}
