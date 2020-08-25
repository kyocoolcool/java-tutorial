package kyocoolcool.exam.exam45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 5:28 PM
 **/
public class Test {

    public static void main(String[] args) throws IOException {
        Stream<Path> files = Files.walk(Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam/exam45"));
        files.forEach(fName ->  {//line n1
            try {
                Path aPath = fName.toAbsolutePath();//line n2
                System.out.println(fName + ":"
                        + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
            } catch (
                    IOException ex) {
                ex.printStackTrace();
            };
        });
    }
}
