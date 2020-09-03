package kyocoolcool.exam_v1495.exam42;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 4:52 PM
 **/
public class Birdie {
    public static void main(String[] args) {
        Bird.fly(() -> new Bird());
        Bird.Penguin.fly(Bird.Penguin::new);
    }
}
