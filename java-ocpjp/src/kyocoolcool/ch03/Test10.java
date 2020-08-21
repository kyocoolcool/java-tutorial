package kyocoolcool.ch03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test10
 * @description
 * @date 2020/7/14 11:23 AM
 **/

public class Test10 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }

    public static void main(String[] args) {
        final String[] s = {"123","Abb", "aab","111"};
        Arrays.sort(s,new Test10());
        for (String s1 : s) {
            System.out.println(s1);
        }

    }
}
