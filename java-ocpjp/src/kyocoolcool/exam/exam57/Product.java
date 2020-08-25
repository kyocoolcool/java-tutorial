package kyocoolcool.exam.exam57;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 上午 12:06
 **/
public class Product {
    public double applyDiscount(double price) {
        assert price>0;
        return price*0.5;
    }

    public static void main(String[] args) {
        final Product product = new Product();
        final double v = product.applyDiscount(Double.parseDouble(args[0]));
        System.out.println("new Price"+v);
    }
}