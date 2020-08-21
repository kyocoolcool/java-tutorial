package kyocoolcool.ch03;

import java.util.List;
import java.util.Vector;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test13
 * @description
 * @date 2020/7/14 2:30 PM
 **/

public class Test13 {
    public void play(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        final Test13 test13 = new Test13();
        final Vector<? extends Number> list = new Vector<Integer>();
        test13.play(list);
    }
}
