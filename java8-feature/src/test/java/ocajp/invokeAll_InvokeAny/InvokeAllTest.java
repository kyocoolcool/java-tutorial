package ocajp.invokeAll_InvokeAny;


import ocajp.thread.Lotto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName ocajp.InvokeAllTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-10 10:33
 * @Version 1.0
 **/

public class InvokeAllTest {

    @Test
    public void test() throws InterruptedException, ExecutionException {
        System.out.println("請給我五組0-99數字");
        ExecutorService executorService = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        System.out.println("計算中");
        List<Future<Integer>> futures = executorService.invokeAll(list);
        System.out.println("您的樂透數字是:");
        for (Future<Integer> future : futures) {
            System.out.print(future.get()+" ");
        }
        executorService.shutdown();
    }
}