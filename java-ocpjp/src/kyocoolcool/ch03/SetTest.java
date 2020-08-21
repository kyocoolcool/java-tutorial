package kyocoolcool.ch03;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className SetTest
 * @description
 * @date 2020/6/24 3:00 PM
 **/

public class SetTest {
    public static void main(String[] args) {
        final Set<Integer> set = new TreeSet<Integer>();
        set.add(66);
        set.add(10);
        set.add(66);
        set.add(8);

        set.forEach(x-> System.out.println(x));

    }
}
