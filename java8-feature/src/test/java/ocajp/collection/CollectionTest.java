package ocajp.collection;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @ClassName CollectionTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-11 11:11
 * @Version 1.0
 **/

public class CollectionTest {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add("aa");
        hs.add("cc");
        hs.add("dd");
        hs.add("bb");
        TreeSet<Object> ts2 = new TreeSet<>(hs);
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("a");
        ts.add("d");
        ts.add("c");
        ts.add("b");
        ts.forEach(x -> System.out.println(x));
        ts2.forEach(System.out::println);
    }
}