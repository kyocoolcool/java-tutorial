package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className PathTest2
 * @description
 * @date 2020/8/9 1:55 PM
 **/

public class PathTest2 {
    public static void main(String[] args) throws IOException {
        final Path path2 = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/resources/zoo.log");
        final Path path = Paths.get("../zoo.log");
//        System.out.println(path);
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));

        }
        System.out.println(path2.subpath(2,3));

        System.out.println(path.resolve(path2));
        System.out.println(Paths.get(".").toRealPath());

        final Path path3 = Paths.get("./java-ocpjp/resources/zoo.log").toRealPath();
        System.out.println(path3);
        final Path path1 = Paths.get("../zoo.log");
        final Path resolve = path3.resolve(path1);
        System.out.println(resolve);
        System.out.println(resolve.normalize());



    }
}
