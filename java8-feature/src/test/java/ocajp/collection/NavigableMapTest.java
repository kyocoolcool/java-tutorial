package ocajp.collection;

import java.util.*;

/**
 * @ClassName NavigableMapTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-11 16:44
 * @Version 1.0
 **/

public class NavigableMapTest {
    public static void main(String[] args) {
//        NavigableMap<Object, Object> map = new TreeMap<>();
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(2);
        ns.add(1);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        System.out.println("預設自然排序: " + ns);
        System.out.println("倒序: " + ns.descendingSet());
        System.out.println("第一個元素: " + ns.first());
        System.out.println("最後一個元素: " + ns.last());
        System.out.println("小於3之最大元素: " + ns.lower(3));
        System.out.println("小於等於3之最大元素: " + ns.floor(3));
        System.out.println("大於2之最小元素: " + ns.higher(2));
        System.out.println("大於等於2之最小元素: " + ns.ceiling(2));
        NavigableSet<MyMoney> ns2 = new TreeSet<>();
        ns2.add(new MyMoney(100));
        ns2.add(new MyMoney(100));
        ns2.add(new MyMoney(300));
        System.out.println(ns2);
    }
}