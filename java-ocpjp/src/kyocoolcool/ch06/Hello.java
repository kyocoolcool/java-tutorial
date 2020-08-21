package kyocoolcool.ch06;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Hello
 * @description
 * @date 2020/7/24 5:15 PM
 **/

public class Hello {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a lo ha!");
//        Assert.check(a> 10);
        assert a > 10:"good";
    }
}
