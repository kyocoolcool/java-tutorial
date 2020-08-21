package kyocoolcool.exam2.exam136;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 1:42 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int ans = 0;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException e) {
            ans = 0;
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println(ans);
    }
}
