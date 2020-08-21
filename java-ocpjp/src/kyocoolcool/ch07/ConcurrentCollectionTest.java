package kyocoolcool.ch07;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ConcurrentCollectionTest
 * @description
 * @date 2020/7/30 4:44 PM
 **/

public class ConcurrentCollectionTest {
    public static void main(String[] args) {
//        final HashMap<String, String> stringStringHashMap = new HashMap<>();
//        stringStringHashMap.put("a", "a");
//        stringStringHashMap.put("b", "b");
//        final Set<String> strings = stringStringHashMap.keySet();
//        for (String string : strings) {
//            System.out.println(string);
//        }
//        stringStringHashMap.remove("a");
//        stringStringHashMap.remove("b");
//        for (String string : strings) {
//            System.out.println(string);
//        }

        final ConcurrentHashMap<String, String> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        objectObjectConcurrentHashMap.put("a", "a");
        objectObjectConcurrentHashMap.put("b", "b");
        final Set<String> stringss = objectObjectConcurrentHashMap.keySet();
        for (String string : stringss) {
            System.out.println(string);
        }
        for (String s : objectObjectConcurrentHashMap.keySet()) {
            objectObjectConcurrentHashMap.remove(s);
        }
        for (String s : objectObjectConcurrentHashMap.keySet()) {
            System.out.println(s);
        }
//        for (String s : stringStringHashMap.keySet()) {
//            System.out.print(s);
//        }
//        System.out.println();
//        stringStringHashMap.remove("a");
//        for (String s : stringStringHashMap.keySet()) {
//            System.out.print(s);
//        }
    }
}
