package kyocoolcool.exam.exam155;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/20 6:34 PM
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
            System.out.println("not");
        }
        System.out.println("ans:"+ans);
    }
}
