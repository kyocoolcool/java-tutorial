package kyocoolcool.exam.exam133;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 11:48 AM
 **/
public class Test {
    public static void main(String[] args) {
        final Deque<String> strings = new ArrayDeque<>();
        strings.add("Susan");
        strings.add("Allen");
        strings.add("David");

        final String pop = strings.pop();
        System.out.println(pop);
        final String remove = strings.remove();
        System.out.println(remove);
        System.out.println(strings);


    }
}
