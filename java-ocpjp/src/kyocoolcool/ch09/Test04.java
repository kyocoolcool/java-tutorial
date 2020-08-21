package kyocoolcool.ch09;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test04
 * @description
 * @date 2020/8/13 10:29 AM
 **/

public class Test04 {
    public static void main(String[] args) {
        final Path path = Paths.get("/Users/chris/Documents/test/hello/技能樹.PNG");
        System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
//        System.out.println(path.toAbsolutePath());
//        System.out.println(path.subpath(1, 3).getName(1));
    }
}
