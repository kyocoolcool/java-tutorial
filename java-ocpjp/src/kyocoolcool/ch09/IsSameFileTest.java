package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className IsSameFileTest
 * @description
 * @date 2020/8/10 11:30 AM
 **/

public class IsSameFileTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/resources/zoo.log");
        Path path2 = Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/resources/zoo.log");
        System.out.println(Files.isSameFile(path, path2));
//        System.out.println(path2);
        System.out.println(path.equals(path2));
    }


}
