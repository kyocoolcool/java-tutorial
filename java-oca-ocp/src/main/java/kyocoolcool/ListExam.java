package kyocoolcool;

import java.util.ArrayList;

/**
 * @ClassName ListExam
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/10/31 10:00 AM
 * @Version 1.0
 **/

public class ListExam {
    public static void main(String[] args) {
        final ArrayList arrayList = new ArrayList();
        String[] str = {"aaa", "bbb"};
        arrayList.add(str);
        String[] strings = (String[]) arrayList.get(0);
        System.out.println(strings[0]);
    }
}