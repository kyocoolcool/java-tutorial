package kyocoolcool.exam_v1495.exam158;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 10:43 AM
 **/
class Product {
    String name;
    Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void printVal() {
        System.out.println(name+"  "+price);
    }

//    public static class Hello {
//        public static void printVal(Product p) {
//            System.out.println(p);
//        }
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

public class Test {
    public static void main(String[] args) {
        final List<Product> list = Arrays.asList(new Product("TV", 1000),
                new Product("Refrigerator", 2000)
        );
        Consumer<Product> raise = e -> e.setPrice(e.getPrice() + 100);
        list.forEach(raise);
//        list.forEach(Product.Hello::printVal);
        list.forEach(Product::printVal);
    }

}
