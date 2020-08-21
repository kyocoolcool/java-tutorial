package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className MkdirTest
 * @description
 * @date 2020/8/10 2:29 PM
 **/

public class MkdirTest {
    public static void main(String[] args) throws IOException {
//        final File file = new File("/Users/chris/Documents/hello/hello.md");
//        final boolean amd = file.mkdir();
//        System.out.println(amd);
        final Path path = Paths.get("/Users/chris/Documents/hello/aaa.md");
        final Path pathDir = Paths.get("/Users/chris/Documents/hello/bbb.md");
        final Path path2 = Paths.get("/Users/chris/Documents/hello/bbb.md");
        final Path path3 = Paths.get("/Users/chris/Documents/hello2/bbb.md");
//        final Path directories = Files.createDirectories(path);
//        final Path directories2 = Files.createDirectories(path2);
        final Path copy = Files.copy(path2, path3);
//        Files.deleteIfExists(pathDir);
    }
}
