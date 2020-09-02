package kyocoolcool.exam.exam135;

import java.util.ArrayList;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/20 4:31 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        list.add("brian");
        list.add("brianA");
        list.add("brianB");
        list.add("brian");
        final boolean result = list.remove("brian");
        System.out.println(result);
        list.remove("aaa");
        System.out.println(list);
    }
}
