package kyocoolcool.exam.exam56;

import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/17 11:02 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(null);
        list.remove(2);
        list.remove(null);
//        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }
}
