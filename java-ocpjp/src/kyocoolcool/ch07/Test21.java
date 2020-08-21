package kyocoolcool.ch07;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test21
 * @description
 * @date 2020/8/3 2:52 PM
 **/

public class Test21 {
    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        final ArrayList<Future> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final Future<Integer> submit = executorService.submit(() -> 1);
            futures.add(submit);
        }

        futures.forEach(x-> {
            try {
                System.out.println( x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

    }
}
