package kyocoolcool.exam_v1495.exam13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/9 5:56 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final ArrayList ps = new ArrayList<>();
        final Patient p2 = new Patient("Mike");
        ps.add(p2);
        final Patient p3 = new Patient("Mike");

        System.out.println(p2.equals(p3));
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        final HashMap hashMap = new HashMap();
        hashMap.put("1", p2);
        hashMap.put("2",p3);

        final Set set = hashMap.keySet();
//        System.out.println(set.iterator().next());
//        while (set.iterator().hasNext()){

//        }
        final Object o = hashMap.get("2");
        System.out.println(((Patient)o).name);


//        final String s = (String) hashMap.get(p2);
//        System.out.println("s:"+s);

        int f = ps.indexOf(p3);
        if (f >= 0) {
            System.out.println("Mike found");
        }
    }
}
