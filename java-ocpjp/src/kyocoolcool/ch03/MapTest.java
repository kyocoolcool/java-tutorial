package kyocoolcool.ch03;

import java.util.HashMap;
import java.util.function.BiFunction;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className MapTest
 * @description
 * @date 2020/6/28 12:56 PM
 **/

public class MapTest {
    public static void main(String[] args) {
        final BiFunction<String, String, String>
                biFunction = (String x, String y) -> {
            return x.length() > y.length() ? x : y;
        };
        final HashMap<String, String> map = new HashMap<>();
        map.put("hello", "hello today");
        map.put("nice", "nice today");
        final String merge = map.merge("hello", "good morning", biFunction);
        System.out.println(merge);
        System.out.println(map);
    }
}
