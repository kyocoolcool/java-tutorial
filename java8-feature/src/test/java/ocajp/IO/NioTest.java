package ocajp.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @ClassName NioTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-14 17:13
 * @Version 1.0
 **/

public class NioTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/chris/Documents/講義/Java8/螢幕快照 2019-04-03 上午10.38.02.png");
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toUri());
        System.out.println(path.isAbsolute());
        System.out.println(path.subpath(0, 2));
        Path path2 = Paths.get("/Users/chris/Documents/../講義/Java8/螢幕快照 2019-04-03 上午10.38.02.png").normalize();
        System.out.println(path2.getFileName());
        Path resolve = path.resolve(path2);
        Path path3 = Paths.get("aaa.di");
        System.out.println(resolve);
        System.out.println(path.resolve(path3));
        Path path4 = Paths.get("/Users/chris/Documents/IDEA key");
        Path path5 = Paths.get("/Users/chris/Documents/Zoom/IDEA key");
        System.out.println(path4.relativize(path5));
        System.out.println(path4.startsWith(path5));
        System.out.println(path4.endsWith(path5));
        Files.copy(path4, path5, StandardCopyOption.REPLACE_EXISTING);

    }
}