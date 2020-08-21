package kyocoolcool.ch09;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test01
 * @description
 * @date 2020/8/12 4:51 PM
 **/

public class Test01 {
    public static void main(String[] args) {
        final Path path = Paths.get("java-ocpjp/resources/test.log");
        final Path path2 = Paths.get("java-ocpjp/resources/test2.log");
        System.out.println(path2);
        System.out.println(path2.normalize().relativize(path));

    }
}
