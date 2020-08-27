package kyocoolcool.exam.exam108;

import java.util.ArrayDeque;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 2:54 PM
 **/
public class Test {
    public static void main(String[] args) {
        final ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(1000);
        integers.push(2000);
        integers.add(3000);
        integers.push(4000);
//        final Integer pop = integers.pop();
//        System.out.println(pop);
//        final Integer pop2 = integers.pop();
//        System.out.println(pop2);
//        System.out.println(integers.peek());
//        final boolean offer = integers.offer(5000);
//        System.out.println(offer);
        final Integer remove = integers.remove();
        System.out.println(remove);
        final Integer pop = integers.pop();
        System.out.println(pop);
    }
}
