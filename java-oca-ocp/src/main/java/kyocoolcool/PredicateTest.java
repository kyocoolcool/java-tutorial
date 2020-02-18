package kyocoolcool;

import java.util.function.Predicate;

/**
 * @ClassName PredicateTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/12 4:35 PM
 * @Version 1.0
 **/

/*
 * //anteater
 */
//bear
    // //cat
    // /* dog */
    /* ele */
    /*
     * /* eee */

public class PredicateTest {
    public static void main(String[] args) {
        System.out.println(test((Integer i)->{
            return i==5;
        }));
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}