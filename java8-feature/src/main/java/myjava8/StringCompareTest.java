package myjava8;

import java.util.*;

/**
 * @ClassName StringCompareTest
 * @Description TODO
 * @Author chris
 * @Date 2019-02-18 11:55
 * @Version 1.0
 **/

public class StringCompareTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("張三", "李四", "王五", "老六");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println(list);

        Collections.sort(list,(String o1,String o2) ->{
            return o2.compareTo(o1);
        });

        System.out.println(list);
    }
}