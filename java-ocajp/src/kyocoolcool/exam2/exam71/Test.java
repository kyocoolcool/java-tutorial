package kyocoolcool.exam2.exam71;

import java.util.ArrayList;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/23 10:20 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList<Object> objects = new ArrayList<>();
        objects.add("A");
        objects.add("B");
        objects.add("C");
        objects.add("D");
        objects.remove(2);
        objects.add(3, "G");
        System.out.println(objects);
    }
}
