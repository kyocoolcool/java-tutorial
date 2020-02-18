package kyocoolcool;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/21 2:02 PM
 * @Version 1.0
 **/

public class StringTest {
    public static void main(String[] args) {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "G");
        System.out.println(x + " " + y + " " + z);
    }
}