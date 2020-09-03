package kyocoolcool.exam_v1495.exam170;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 5:23 PM
 **/


public class Product {
    int id;
    int price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public String toString() {
        return id + ":" + price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, 10), new Product(2, 30),
                new Product(3, 5)));
        Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
//            return new Product(p1.id, p1.price += p2.price);
            p1.price += p2.price;
//            System.out.println("id"+p1.id);
//            System.out.println("price"+p1.price);
            return new Product(p1.id, p1.price);
        });
        products.add(p);
//        System.out.println(products);
        final Optional<Product> reduce = products.stream()
                .reduce((p1, p2) -> {
                    System.out.println("p1"+p1);
                    System.out.println("p2"+p2);
                    return p1.price <p2.price ? p1 : p2; });
        System.out.println(reduce.get());
//                .ifPresent(System.out::println);
    }
}
