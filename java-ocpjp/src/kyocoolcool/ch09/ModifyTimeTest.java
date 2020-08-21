package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ModifyTimeTest
 * @description
 * @date 2020/8/11 3:08 PM
 **/

public class ModifyTimeTest {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/Users/chris/Documents/技能樹.PNG");
        final FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        Instant instant = Instant.ofEpochMilli(lastModifiedTime.toMillis());
        ZoneId zone = ZoneId.systemDefault();
        final LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        System.out.println(localDateTime);
        final long l = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Files.setLastModifiedTime(path, FileTime.fromMillis(l));

    }
}
