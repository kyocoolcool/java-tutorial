package kyocoolcool.exam_v1475.exam116;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 6:26 PM
 **/
public class Test {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Pics/MyPic.jpeg");
        System.out.println(p1.getNameCount() +
                ":" + p1.getName(1) +
                ":" + p1.getFileName());
    }
}
