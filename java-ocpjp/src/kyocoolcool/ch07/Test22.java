package kyocoolcool.ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test22
 * @description
 * @date 2020/8/3 3:08 PM
 **/

public class Test22 {
    static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<?>> results = new ArrayList<>();
        IntStream.iterate(0, i -> i + 1).limit(5).forEach(
                i -> results.add(service.submit(() -> counter++)) // n1
        );
        for (Future<?> result : results) {
            System.out.print(result.get() + " "); // n2
        }
        service.shutdown();
    }
}
