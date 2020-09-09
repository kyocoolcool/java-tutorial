package kyocoolcool.exam_v1475.exam117;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 6:30 PM
 **/
public class Test {
    String name;
    int qty;

    public Test(Test test) {
        this(test.name, test.qty);
    }

    public String toString() {
        return name;
    }

    public Test(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public Test() {
    }

    static class ProductFilter {
        public static boolean isAvailable(Test p) {
            return p.qty >= 10;
        }
    }

    public void play(Test product) {
        System.out.println(product);
    }

    public static void main(String[] args) {
        final List<Test> asList = Arrays.asList(new Test("MotherBoard", 5),
                new Test("Speaker", 20));

//        asList.stream().filter(Test.ProductFilter::isAvailable).forEach(s-> System.out.println(s));
    }
}
