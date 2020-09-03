package kyocoolcool.exam_v1495.exam156;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 10:25 AM
 **/

class Product {
    String name;
    int qty;

    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }

     static class ProductFilter {
       public static boolean isAvalible(Product p) {
            return p.qty >= 10;
        }
    }

}

public class Test {
    public static void main(String[] args) {
        final List<Product> products = Arrays.asList(new Product("MotherBoard", 5),
                new Product("Speacker", 20));
        products.stream().filter(Product.ProductFilter::isAvalible).forEach(System.out::println);

    }
}
