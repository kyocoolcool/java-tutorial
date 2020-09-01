package myjava8;

import java.util.function.Predicate;

/**
 * @ClassName PredicateTest
 * 
 * @Author chris
 * @Date 2019-02-20 15:50
 * @Version 1.0
 **/

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate= value->value.length()>5;
        System.out.println(predicate.test("Welcome"));
        System.out.println("Git Hub Test");
    }
}