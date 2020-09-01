package ocajp.IO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @ClassName SimpleFileVisitorTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-17 10:33
 * @Version 1.0
 **/

public class SimpleFileVisitorTest extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher;

    public SimpleFileVisitorTest() {
        matcher = FileSystems.getDefault().getPathMatcher("glob:*.{html,txt,xml,png}");
    }

    private void search(Path file) {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            System.out.println("比對成功:" + name + "\t");
            System.out.println("完整路徑" + file);
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        search(file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("/Users/chris/Documents/Photos"), new SimpleFileVisitorTest());
    }
}