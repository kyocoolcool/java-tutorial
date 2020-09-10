package kyocoolcool.exam_v1475.exam138;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:08 AM
 **/
public class Test {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = {1, 2, 3, 4, 5};
        a = b;
        for (int i : a) {
            System.out.println(i);
        }
    }
}
