package kyocoolcool.ch09;


import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className PathTest
 * @description
 * @date 2020/8/7 4:42 PM
 **/

public class PathTest {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
//        final Path path = Paths.get(new URI("file:///Users/chris/Documents/技能樹.PNG"));
//        System.out.println(path.getFileName());
//        final Path path2 = Paths.get(new URI("http://s.imgur.com/desktop-assets/desktop-assets/icon-emerald-adfree-shadow.40e61ddbf16e9d06c22b5b6fb1383cf6.png"));
//        final Path path2 = Paths.get(new URI("http://www.wiley.com"));
//        System.out.println(path2.getFileName());
        URL url = new URL("http://s.imgur.com/desktop-assets/desktop-assets/icon-emerald-adfree-shadow.40e61ddbf16e9d06c22b5b6fb1383cf6.png");
        final Path path = Paths.get(url.toURI().getPath());
        System.out.println(path.toUri());
//        System.out.println(path.getFileName());
//        File file = Paths.get(url.toURI().getPath()).toFile();

    }
}
