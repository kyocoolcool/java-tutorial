package kyocoolcool;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName CompareTest
 * @Description TODO
 * @Author chris
 * @Date 2019-03-24 02:09
 * @Version 1.0
 **/

public class CompareTest {
    @Test
    public void test01(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("id", "1");
        map1.put("name", "p");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("id", "2");
        map2.put("name", "h");
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("id", "3");
        map3.put("name", "f");
        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("id", "0");
        map4.put("name", "f");
        list.add(map1);
        list.add(map3);
        list.add(map4);
        list.add(map2);
        //排序前
        for (Map<String, Object> map : list) {

            System.out.println(map.get("id"));
            System.out.println(map.get("name"));
        }

        Collections.sort(list, new Comparator<Map<String, Object>>(){

            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                String name1 =(String)o1.get("name");//name1是从你list里面拿出来的一个
                String name2= (String)o2.get("name"); //name1是从你list里面拿出来的第二个name
                return name1.compareTo(name2);
            }

        });
        //排序后
        System.out.println("-------------------");
        for (Map<String, Object> map : list) {

            System.out.println(map.get("name"));
        }
    }
    @Test
    public void tet02(){
        Comparator<Integer> compareTest = (o1, o2) -> o1.compareTo(02);
        TreeSet<Integer> ts = new TreeSet<Integer>(compareTest);
    }
}