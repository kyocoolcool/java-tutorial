package kyocoolcool;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListIndexOfTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/10/30 10:10 AM
 * @Version 1.0
 **/

public class ListIndexOfTest {
    public List<String> hello() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Y");
        list.add("Y");
        int y = list.indexOf("Y");
        final int n = list.indexOf("N");
        System.out.println(y);
        System.out.println(n);
        ListIndexOfTest listIndexOfTest = new ListIndexOfTest();
        List list3 = listIndexOfTest.hello();
        list3.add(1);
        System.out.println(list3);
        System.out.println(list3.indexOf(1));
    }
}