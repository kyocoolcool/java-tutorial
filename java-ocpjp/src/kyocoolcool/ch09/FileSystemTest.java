package kyocoolcool.ch09;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FileSystemTest
 * @description
 * @date 2020/8/7 5:25 PM
 **/

public class FileSystemTest {
    public static void main(String[] args) throws URISyntaxException, IOException {
        final Path path = FileSystems.getDefault().getPath("/Users/chris/Documents/技能樹.PNG");
        System.out.println(path.getFileName());
        final URL url = new URL("http://www.selikoff.net");
        final FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
//        final FileSystem fileSystem = FileSystems.getFileSystem(new URI("file:///Users/chris/Documents/技能樹.PNG"));
//                final Path path2 = Paths.get(new URI("file:///Users/chris/Documents/技能樹.PNG"));
//        System.out.println(path2.getFileName());
//        Map<String, String> env = new HashMap<>();
//        env.put( "create", "true" ); // creates zip/jar file if not already exists
//        FileSystem fs = FileSystems.newFileSystem( uri, env );
//        final FileSystem fileSystem = FileSystems.newFileSystem(url.toURI(),env);

    }
}
