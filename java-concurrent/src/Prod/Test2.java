package Prod;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/18 11:24 AM
 * @Version 1.0
 **/

public class Test2 {
    public static void main(String[] args) {
        final ConcurrentSkipListSet<Integer> ints = new ConcurrentSkipListSet<Integer>();
        int i = 0;
        while (i < 5) {
            ints.add(i);
            i++;
        }
        int x = 0;
        while (x < 5) {
            System.out.println("取出數字:"+ints.pollFirst());
            System.out.println("剩餘數量:"+ints.size());
            x++;
        }


    }
}
