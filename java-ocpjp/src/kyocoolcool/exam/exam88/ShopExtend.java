package kyocoolcool.exam.exam88;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 5:13 PM
 **/
public class ShopExtend extends Shop {
    public double discount = 0.35;
    public String a = "100";

    public void hello(String a) {
        System.out.println("extend"+a);
    }
    public static void main(String[] args) {
        final ShopExtend shopExtend = new ShopExtend();
        System.out.println(shopExtend.discount);
        shopExtend.hello(shopExtend.a);
        System.out.println(shopExtend.a);
    }
}
