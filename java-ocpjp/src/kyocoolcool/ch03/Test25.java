package kyocoolcool.ch03;

import java.util.HashMap;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test25
 * @description
 * @date 2020/7/14 4:52 PM
 **/

public class Test25 {
    public static void main(String[] args) {
        final HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a, b) -> a + b);
        System.out.println(map);
        map.merge(3, 3, (a, b) -> a + b);
        System.out.println(map);
    }
}
