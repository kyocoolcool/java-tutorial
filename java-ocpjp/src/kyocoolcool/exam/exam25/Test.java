package kyocoolcool.exam.exam25;

import java.util.TreeMap;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 5:56 PM
 **/
public class Test {
    public static void main(String[] args) {
        final TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1007, "A");
        map.put(1002, "C");
        map.put(1001, "B");
        map.put(1003, "B");
        System.out.println(map);
    }
}
