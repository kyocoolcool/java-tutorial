package kyocoolcool.ch03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test20
 * @description
 * @date 2020/7/14 4:19 PM
 **/

public class Test20 {
    public static void main(String[] args) {
        final Queue<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.remove(10);
        System.out.println(integers);
    }
}
