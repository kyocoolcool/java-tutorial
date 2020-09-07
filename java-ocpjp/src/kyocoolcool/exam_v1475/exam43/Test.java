package kyocoolcool.exam_v1475.exam43;

import java.util.ArrayList;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 4:12 PM
 **/
public class Test {
    public static void main(String[] args) {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("greed");
        strings.add("red");
        strings.add("blue");
        strings.add("yellow");
        strings.remove(2);
        strings.add(3, "cyan");
        System.out.println(strings);

    }
}
