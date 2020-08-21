package kyocoolcool.ch04;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className LambdaTest
 * @description
 * @date 2020/7/16 10:33 AM
 **/

public class LambdaTest {
    public static void main(String[] args) {
//        final Supplier<ArrayList<String>> sup = ArrayList<String>::new;
//        final ArrayList<String> list = sup.get();
//        System.out.println(list);
//
//        final BiPredicate<String, String> biFunction = String::startsWith;
//        System.out.println(biFunction.test("chicken", "hick"));
//        final Predicate<String> predicate = x -> x == "1";
//        System.out.println(predicate.test("2"));
        final Predicate<String> egg = s -> s.toLowerCase().contains("egg");
        final Predicate<String> brown = s -> s.toLowerCase().contains("brown");
        System.out.println(egg.test("egg"));
        System.out.println(egg.test("brown"));
        System.out.println(brown.test("egg"));
        System.out.println(brown.test("brown"));
        System.out.println(egg.and(brown).test("egg brown"));
        System.out.println(egg.and(brown).negate().test("egg Mrrown"));
//        final Predicate<String> isEmpty = String::isEmpty;
        final Function<List,String> fu = x ->  (String) x.get(0);
    }
}
