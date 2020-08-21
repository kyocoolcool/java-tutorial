package kyocoolcool.exam2.exam168;

import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 3:30 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        if (arrayList.remove("A")) {
            arrayList.remove(2);
        }

        System.out.println(arrayList);
    }
}
