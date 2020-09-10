package kyocoolcool.exam_v1475.exam167;

import java.io.IOException;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:40 AM
 **/

class Video {
    public void play() throws IOException, Exception {
        System.out.println("video");
    }
}
public class Test extends Video{
    @Override
    public void play() throws IOException,Exception {
        super.play();
        System.out.println("game");
    }

    public static void main(String[] args) throws Exception {
        final Test test = new Test();

        test.play();
    }
}
