package kyocoolcool.exam_v1495.exam152;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 7:29 PM
 **/
class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) {
        final Product p1 = new Product("PowerCharger");
        Product p2 = p1;
        System.out.println(p2.equals(p2));
        final Product p3 = new Product("PowerCharger");
        System.out.println(p1.equals(p3));
    }
}
