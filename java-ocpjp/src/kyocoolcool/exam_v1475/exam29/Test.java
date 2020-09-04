package kyocoolcool.exam_v1475.exam29;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 5:40 PM
 **/
public class Test {
    public static void main(String[] args) {
        final HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        integerIntegerHashMap.put(1, 10);
        integerIntegerHashMap.put(2, 20);
        BiConsumer<Integer, Integer> c = (x, y) -> System.out.println(x + "," + y);
        c.accept(1,2);
        integerIntegerHashMap.forEach(c);
    }
}
