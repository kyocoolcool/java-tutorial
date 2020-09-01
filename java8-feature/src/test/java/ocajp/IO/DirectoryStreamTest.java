package ocajp.IO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @ClassName DirectoryStreamTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-17 09:51
 * @Version 1.0
 **/

public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/chris/Documents/Photos");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, "*.{java,html,png}")) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}