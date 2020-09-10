package kyocoolcool.exam_v1475.exam163;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:30 AM
 **/
class ThreadRunner implements Runnable {
    public void run() {
        System.out.print("Runnable");
    }
}

class ThreadCaller implements Callable<String> {
    public String a;

    @Override
    public String call() throws Exception {
        return "Callable";
    }

}

public class Test {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Runnable r1 = new ThreadRunner();
        Callable c1 = new ThreadCaller();
        es.shutdown();

        es.execute(r1);
        es.submit(r1);
        Future<String> f1 = es.submit (c1);
    }

}
