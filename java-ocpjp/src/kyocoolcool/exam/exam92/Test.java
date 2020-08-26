package kyocoolcool.exam.exam92;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 5:44 PM
 **/
public class Test {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Pics/MyPic.jpeg");
        System.out.println (p1.getNameCount() +
                ":" + p1.getName(1) +
                ":" + p1.getFileName());
    }
}
