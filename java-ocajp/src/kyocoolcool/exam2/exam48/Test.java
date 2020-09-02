package kyocoolcool.exam2.exam48;

import java.util.ArrayList;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/21 5:05 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(null);
        integers.remove(Integer.valueOf(1));
        integers.remove(null);
        System.out.println(integers);
    }
}
