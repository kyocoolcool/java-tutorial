package kyocoolcool.exam.exam64;

import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/17 11:30 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList colors = new ArrayList();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        colors.add(4, "cyan");
        System.out.println(colors);

    }
}
