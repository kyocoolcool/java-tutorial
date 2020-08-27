package kyocoolcool.exam.exam110;

import java.util.concurrent.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 3:14 PM
 **/

class R implements Runnable {
    @Override
    public void run() {
        System.out.println("Run...");
    }
}

class C implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Call...";
    }
}
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       ExecutorService es= Executors.newSingleThreadExecutor();
//       es.execute(new R());
        final Future<?> submit1 = es.submit(new R());
        System.out.println("submit1:"+submit1.get());
        final Future<String> submit = es.submit(new C());
        System.out.println(submit.get());
        es.shutdown();
    }
}
