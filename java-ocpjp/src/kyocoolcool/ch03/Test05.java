package kyocoolcool.ch03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test05
 * @description
 * @date 2020/7/14 10:29 AM
 **/

public class Test05 {
    public static void main(String[] args) {
//        final HashSet<? super RuntimeException> integerHashSet = new HashSet<Exception>();
//        integerHashSet.add(new ClassCastException());
//        integerHashSet.add(new ArrayStoreException());
        final HashSet<Number> hahSet = new HashSet();
        hahSet.add(null);
        hahSet.add(85);
        hahSet.add(20L);
        hahSet.add(1f);
        hahSet.add(85);
        final Iterator<Number> iterator = hahSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
