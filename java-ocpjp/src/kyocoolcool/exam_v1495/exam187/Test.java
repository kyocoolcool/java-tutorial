package kyocoolcool.exam_v1495.exam187;

import java.util.function.DoubleSupplier;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 09:55
 **/
public class Test {
    String name;
    Double cost;

    public Test(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public static void main(String[] args) {
        final Test test = new Test("Chris", null);
        final DoubleSupplier doubleSupplier = test::getCost;
        System.out.println(test.getName()+":"+doubleSupplier.getAsDouble());


    }
}