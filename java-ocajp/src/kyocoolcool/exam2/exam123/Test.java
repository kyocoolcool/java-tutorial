package kyocoolcool.exam2.exam123;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/24 11:04 AM
 * @Version 1.0
 **/

public class Test {
    public static boolean isOK(int x) {
        return --x > 0 ? true : false;
    }
    public static void main(String[] args) {
        int x=6;
        while (isOK(--x)) {
            System.out.println(x);
        }
    }
}
