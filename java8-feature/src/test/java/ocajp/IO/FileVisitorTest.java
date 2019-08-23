package ocajp.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @ClassName FileVisitorTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-17 10:06
 * @Version 1.0
 **/

public class FileVisitorTest implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        printFile(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        throw new IOException("Failed.");
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }


    public void printFile(Path file) {
        System.out.println(file);
    }

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("/Users/chris/Documents/Photos"), new FileVisitorTest());
    }
}