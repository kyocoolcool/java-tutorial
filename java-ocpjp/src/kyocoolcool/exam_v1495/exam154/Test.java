package kyocoolcool.exam_v1495.exam154;

import java.util.concurrent.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 10:08 AM
 **/

class ThreadRunner implements Runnable {
    public void run() {
        System.out.println("Runnable");
    }
}

class ThreadCaller implements Callable<String> {
    public String call() throws Exception {
        return "Callable";
    }
}

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService es = executorService;
        Runnable r1 = new ThreadRunner();
        Callable<String> c1 = new ThreadCaller();
//        executorService.execute(r1);
        executorService.submit(r1);
        final Future<String> submit = executorService.submit(c1);
        System.out.println(submit.get());
        es.shutdown();
    }
}
