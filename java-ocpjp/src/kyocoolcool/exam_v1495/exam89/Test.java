package kyocoolcool.exam_v1495.exam89;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 5:27 PM
 **/
public class Test {
    public static void main(String[] args) {
        final Map<Integer, String> map = new TreeMap<>();
        map.put(1007, "A");
        map.put(1003, "B");
        map.put(1008, "A");
        map.put(1003, "AR");
        System.out.println(map);
    }
}
