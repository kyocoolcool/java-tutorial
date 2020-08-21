package kyocoolcool.ch03;

import java.util.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test15
 * @description
 * @date 2020/7/14 3:07 PM
 **/

public class Test15 {
    public static void main(String[] args) {
        Comparator<String> c = (a, b) -> b.compareTo(a);
        List<String> list = Arrays.asList("5","4", "7", "1");
        Collections.sort(list, c);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "1"));
    }
}
