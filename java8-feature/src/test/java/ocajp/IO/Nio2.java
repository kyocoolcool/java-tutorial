package ocajp.IO;

import java.io.*;
import java.net.URI;
import java.nio.file.*;

/**
 * @ClassName Nio2
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-14 19:34
 * @Version 1.0
 **/

public class Nio2 {
    public static void main(String[] args) {
        /**串流複製*/
        String url = "https://raw.githubusercontent.com/kocoolcool/kyocoolcool.github.io/master/screenshots/github-logo.png";
        URI uri = URI.create(url);
        Path path = Paths.get("/Users/chris/Documents/Zoom/123.png");
        try {
            InputStream inputStream = uri.toURL().openStream();
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**移動檔案*/
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            Path path3 = fileSystem.getPath("/Users/chris/Documents/Zoom/123.png");
            Path path1 = Paths.get("/Users/chris/Documents/Photos/456.png");
            Files.move(path3, path1, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}