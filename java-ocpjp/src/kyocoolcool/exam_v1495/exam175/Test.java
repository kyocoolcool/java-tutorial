package kyocoolcool.exam_v1495.exam175;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 03:19
 **/
public class Test {
    public static void main(String[] args) {
        final HashMap<Integer, Integer> mval = new HashMap<>();
        mval.put(1,10);
        mval.put(2,20);
        BiConsumer<Integer, Integer> c = (i, j) -> {System.out.print (i + "," + j+ "; ");};
        c.accept(1,2);
//        mval.forEach(c);
    }
}