package kyocoolcool.exam_v1495.exam11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 10:29 AM
 **/
public class MapTest {
    public static void main(String[] args) {
        final HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "z");
        map.put(5, "b");
        map.put(1, "d");
        map.put(7, "e");
        map.put(50, "j");
        final TreeMap<Integer, String> treeMap = new TreeMap<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                }
        );
        treeMap.putAll(map);
        for (Map.Entry<Integer, String> integerStringEntry : treeMap.entrySet()) {
            System.out.println(integerStringEntry.getValue());
        }
    }
}
