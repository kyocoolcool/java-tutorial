package ocajp.collection;

import ocajp.collection.Cat;

import java.util.HashSet;

/**
 * @ClassName HashSetTest
 * @Description
 * @Author Chris Chen
 * @Date 2019-06-13 15:04
 * @Version 1.0
 **/

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        Cat cat = new Cat();
        cat.setName("cat");
        cat.setAge(20);
        set.add(cat);
        System.out.println(set);
        System.out.println(1<<4);
        Integer a=16;
        System.out.println("hashCode:"+a.hashCode());
        System.out.println(1&2);
    }
}