package kyocoolcool.exam_v1475.exam3;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 2:16 PM
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
        System.out.println(p2.equals(p1));
        final Product p3 = new Product("PowerCharger");
        System.out.println(p3.equals(p1));
    }
}
