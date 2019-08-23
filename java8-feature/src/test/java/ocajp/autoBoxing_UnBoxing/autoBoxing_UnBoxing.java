package ocajp.autoBoxing_UnBoxing;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName ocajp.autoBoxing_UnBoxing.ocajp.autoBoxing_UnBoxing
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-13 10:09
 * @Version 1.0
 **/

public class autoBoxing_UnBoxing {
    public static void main(String[] args) {
        int c = 1;
        Integer d = null;
        int i = 1;
        Integer a = i;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        ArrayList<Object> list = new ArrayList<>();
        list.add(c);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("c", c);
        System.out.println(d);

    }
}