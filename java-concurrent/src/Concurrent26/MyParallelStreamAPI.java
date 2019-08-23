package Concurrent26;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName MyParallelStreamAPI
 * @Description ParallelStream多線程處理
 * @Author Chris Chen
 * @Date 2019-08-11 14:49
 * @Version 1.0
 **/

public class MyParallelStreamAPI {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        var random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(1000000 + random.nextInt(1000000));
        }
        /*單線程*/
        long start = System.currentTimeMillis();
        var list1 = new ArrayList<Integer>();
        list.forEach(v -> {
            Boolean prime = isPrime(v);
            if (prime == true) list1.add(v);
        });
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        /*多線程*/
        long star2 = System.currentTimeMillis();
        var list2 = new ArrayList<Integer>();
        list.parallelStream().forEach(
                v -> {
                    Boolean prime = isPrime(v);
                    if (prime == true) list2.add(v);
                }
        );
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - star2);
        System.out.println("單線程:"+list1.size());
        System.out.println("多線程:"+list2.size());
    }

    public static Boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}