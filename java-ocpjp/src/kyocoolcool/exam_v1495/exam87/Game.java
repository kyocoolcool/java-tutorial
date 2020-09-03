package kyocoolcool.exam_v1495.exam87;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 5:01 PM
 **/
public class Game extends Video{
    @Override
    public void play() throws Exception {
        super.play();
        System.out.println("hello");
    }

    public static void main(String[] args) {
        final Game game = new Game();
        try {
            game.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
