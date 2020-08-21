package kyocoolcool.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test
 * @description
 * @date 2020/6/23 3:48 PM
 **/

public class Test {
    public static void main(String[] args) {
        String[] strs = {"aaa", "bbb"};
        final List<String> list = Arrays.asList(strs);
        System.out.println(list);
        list.set(1, "test");
        System.out.println(list);
        strs[0] = "ccc";
        System.out.println(list);
        final String[] s = (String[]) list.toArray();
        list.remove(0);

        final ArrayList<String> list1 = new ArrayList();
        list1.add("1");


    }
}
