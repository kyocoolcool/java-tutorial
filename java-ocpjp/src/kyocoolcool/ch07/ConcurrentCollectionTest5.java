package kyocoolcool.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ConcurrentCollectionTest
 * @description
 * @date 2020/7/30 4:44 PM
 **/

public class ConcurrentCollectionTest5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        final CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>(Arrays.asList(1, 100, 5, 2, 99));
//        for (Integer integer : integers) {
//            System.out.println(integer);
//            integers.add(20);
//        }
//        System.out.println("---------------");
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }


//        final ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(1, 100, 5, 2, 99));
//        for (Integer integer : integers1) {
//            System.out.println(integer);
//            integers1.add(20);
//        }

        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Integer> list =
                Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
//        final CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList(Arrays.asList(4, 3, 52));
//        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
        for (Integer i : list) {
            int finalI = i;
            final Future<Integer> submit = executorService.submit(() ->
                    {
                        final Integer integer = list.get(0);
                        list.remove(0);
                        return integer;
                    }
            );
            System.out.println(submit.get());
        }
//
//        synchronized (list) {
//            for (int data : list)
//                System.out.print(data + " ");
//        }
    }
}
