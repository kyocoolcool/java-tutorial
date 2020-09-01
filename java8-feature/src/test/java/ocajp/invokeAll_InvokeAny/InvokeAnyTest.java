package ocajp.invokeAll_InvokeAny;

import ocajp.thread.Lotto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.*;

/**
 * @ClassName InvokeAnyTest
 *
 * @Author Chris Chen
 * @Date 2019-06-10 11:09
 * @Version 1.0
 **/

public class InvokeAnyTest {

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
        Integer result = executorService.invokeAny(list);
        System.out.println("您的樂透數字是:");
        executorService.shutdown();
        System.out.println("最先處理完的: "+result);
    }
}