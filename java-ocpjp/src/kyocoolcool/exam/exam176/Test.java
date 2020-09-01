package kyocoolcool.exam.exam176;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 03:57
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final Path source = Paths.get("green.txt");
        Path target = Paths.get("yellow.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
//        Files.delete(source);
//        final BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
//        System.out.println(attributes.creationTime());}
    }
}