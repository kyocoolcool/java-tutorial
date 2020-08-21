package kyocoolcool.exam2.exam102;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 12:27 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] arr = {"hi", "how", "are", "you"};
        final ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        if (arrayList.removeIf(s-> {
            System.out.println(s);
            return s.length() <= 2;
        })) {
            System.out.println(" removed");
        }
    }
}
