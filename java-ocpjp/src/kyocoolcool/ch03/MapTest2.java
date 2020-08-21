package kyocoolcool.ch03;

import java.util.HashMap;
import java.util.function.BiFunction;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className MapTest2
 * @description
 * @date 2020/6/28 1:23 PM
 **/

public class MapTest2 {
    public static void main(String[] args) {
        final BiFunction<String, String, String>
                biFunction = (String x, String y) -> null;
        final HashMap<String, String> map = new HashMap<>();
        map.put("aaa", "aaa");
        map.put("bbb", "bbb");
        map.merge("aaa", "aaaa", biFunction);
        map.merge("ccc", "ccc", biFunction);
        System.out.println(map);
    }

}
