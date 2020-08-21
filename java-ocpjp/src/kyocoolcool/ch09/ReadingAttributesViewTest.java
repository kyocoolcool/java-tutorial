package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ReadingAttributesViewTest
 * @description
 * @date 2020/8/11 4:19 PM
 **/

public class ReadingAttributesViewTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/chris/Documents/技能樹.PNG");
        BasicFileAttributeView view =
                Files.getFileAttributeView(path,BasicFileAttributeView.class);
        BasicFileAttributes data = view.readAttributes();
        FileTime lastModifiedTime = FileTime.fromMillis(
                data.lastModifiedTime().toMillis()+10_0000000);
        view.setTimes(lastModifiedTime,null,null);
    }
}
