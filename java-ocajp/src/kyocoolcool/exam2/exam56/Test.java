package kyocoolcool.exam2.exam56;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/21 5:22 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] arr = {"hi", "aaa", "bbb", "ccc"};
        final ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        if(arrayList.removeIf((String s)->{
         return s.length()<=2;
        })){
//            System.out.println(sx +"");
        }

    }
}
