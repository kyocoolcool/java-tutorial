package kyocoolcool.exam.exam107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 11:48 AM
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
        List<Product> products = new ArrayList<Product>(Arrays.asList(new Product(1, 10),
                new Product(2, 30),
                new Product(2, 30)));
        Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
            p1.price += p2.price;
            return new Product(p1.id, p1.price);
        });

        products.add(p);
        products.stream().parallel()
                .reduce((p1, p2) -> {
//                    System.out.println("p1:"+p1);
//                    System.out.println("p2:"+p2);
                    return p1.price > p2.price ? p1 : p2;})
                .ifPresent(System.out::println);
    }
}

