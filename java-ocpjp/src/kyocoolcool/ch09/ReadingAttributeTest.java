package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ReadingAttributeTest
 * @description
 * @date 2020/8/11 3:58 PM
 **/

public class ReadingAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/chris/Documents/技能樹.PNG");
        BasicFileAttributes data = Files.readAttributes(path,
                BasicFileAttributes.class);
        System.out.println("Is path a directory? "+data.isDirectory());
        System.out.println("Is path a regular file? "+data.isRegularFile());
        System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
        System.out.println("Path not a file, directory, nor symbolic link? "+
                data.isOther());
        System.out.println("Size (in bytes): "+data.size());
        System.out.println("Creation date/time: "+data.creationTime());
        System.out.println("Last modified date/time: "+data.lastModifiedTime());
        System.out.println("Last accessed date/time: "+data.lastAccessTime());
        System.out.println("Unique file identifier (if available): "+
                data.fileKey());
    }
}
