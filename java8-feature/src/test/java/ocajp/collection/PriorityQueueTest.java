package ocajp.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName PriorityQueueTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-11 13:53
 * @Version 1.0
 **/

public class PriorityQueueTest {
    public static void main(String[] args) {
//        PriorityQueue<String> queue = new PriorityQueue<>();
        Comparator<String> comparator = (o1, o2) -> o1.toString().compareTo(o2.toString()) * -1;
        PriorityQueue<String> queue = new PriorityQueue<String>(3, comparator);
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        String o;
        while ((o = queue.poll()) != null) {
            System.out.print(o + ",");
        }
    }
}