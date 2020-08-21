package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test03
 * @description
 * @date 2020/8/12 5:14 PM
 **/

public class Test03 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/Documents/test/技能樹.PNG");
        final BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        fileAttributeView.setTimes(null,null,null);
    }
}
