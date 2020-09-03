package kyocoolcool.exam_v1495.exam98;

import java.util.Arrays;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 6:28 PM
 **/
public  class CheckClass {
    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};
        Arrays.sort(strArray,CheckClass::checkValue );
        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }
}
