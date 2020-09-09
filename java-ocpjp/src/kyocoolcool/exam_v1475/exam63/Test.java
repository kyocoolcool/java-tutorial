package kyocoolcool.exam_v1475.exam63;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 9:39 AM
 **/
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            if (i == 3) {
                continue;
            }
            System.out.println("------------");
        }
    }
}
