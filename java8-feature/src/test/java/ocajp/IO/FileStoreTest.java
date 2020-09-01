package ocajp.IO;

import java.nio.file.*;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DecimalFormat;

/**
 * @ClassName FileStoreTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-14 20:06
 * @Version 1.0
 **/

public class FileStoreTest {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = FileSystems.getDefault();
        Iterable<FileStore> fileStores = fileSystem.getFileStores();
        DecimalFormat format = new DecimalFormat("###,###");
        for (FileStore fileStore : fileStores) {
            System.out.println(fileStore + "\t容量" + format.format(fileStore.getTotalSpace()) + " bytes");
        }
        Path path = Paths.get("/Users/chris/Documents/Photos/456.png");
        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(path);
        System.out.println(attr.size());
        System.out.println(attr.isDirectory());
        System.out.println(attr.isRegularFile());
        System.out.println(attr.isSymbolicLink());
        System.out.println(attr.lastModifiedTime());
        System.out.println(Files.getLastModifiedTime(path));
        AclFileAttributeView attributeView = Files.getFileAttributeView(path, AclFileAttributeView.class);
        System.out.println(attributeView);
        BasicFileAttributeView bfv = Files.getFileAttributeView(path,  BasicFileAttributeView.class);
        BasicFileAttributes bfa  = bfv.readAttributes();
        System.out.println(bfa.lastAccessTime());


    }
}