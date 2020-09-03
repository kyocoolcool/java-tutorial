package kyocoolcool.exam_v1495.exam179;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 08:04
 **/
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(5, "x");
        unsortMap.put(99, "b");
        unsortMap.put(1, "d");
        unsortMap.put(10, "e");
        unsortMap.put(8, "j");
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        System.out.println("o1:"+o1);
                        System.out.println("o2:"+o2);
                        System.out.println(o1.compareTo(o2));
                        return o2.compareTo(o2);
                    }
                });
        treeMap.putAll(unsortMap);
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getValue() + " ");
        }
    }
}
