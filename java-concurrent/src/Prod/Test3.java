package Prod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName Test3
 * @Description
 * @Author Chris Chen
 * @Date 2020/2/19 11:20 AM
 * @Version 1.0
 **/

public class Test3 {
    public static void main(String[] args) {
        final ArrayList<Map<String, Object>> list = new ArrayList<>();
//        final ConcurrentSkipListSet<Map<String,Object>> integers2 = new ConcurrentSkipListSet<>();
        final CopyOnWriteArrayList<Map<String,Object>> integers2 = new CopyOnWriteArrayList<>();
        final ArrayList<Map<String, Object>>  integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final Map myMap = new HashMap();
            myMap.put(i, "hello");
            list.add(myMap);
        }
        list.forEach(x->integers2.add(x));
        System.out.println(integers2);
    }
}

