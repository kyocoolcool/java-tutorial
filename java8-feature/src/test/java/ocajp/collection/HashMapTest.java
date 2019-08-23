package ocajp.collection;

import java.util.HashMap;

/**
 * @ClassName HashMapTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-13 14:22
 * @Version 1.0
 **/

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("a", 1);
        map.put(null, 6);
        map.put(null, null);
        System.out.println(map.get(null));
        System.out.println(map.get("a"));
        Cat cat = new Cat();
        cat.setAge(6);
        cat.setName("small Cat");
        map.put("b", cat);
        System.out.println(map.get("b"));
    }
}