package kyocoolcool.exam.exam18;

import java.util.Comparator;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 3:57 PM
 **/
public class CollectorSort implements Comparator<Block> {
    @Override
    public int compare(Block o1, Block o2) {
        return o1.size-o2.size;
    }
}
