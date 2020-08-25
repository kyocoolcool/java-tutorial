package kyocoolcool.exam.exam40;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 4:44 PM
 **/
public class Good {
    String name;

    public void hello(String b,String ... a) {
        System.out.println(b);
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        final Good good = new Good();
        good.hello("aaa","bbb","ccc","ddd");
    }
}
