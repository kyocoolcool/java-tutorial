package kyocoolcool.exam.exam61;

import java.util.concurrent.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 10:21 AM
 **/
class Caller implements Callable<String> {
    String str;

    public Caller(String str) {
        this.str = str;
    }

    @Override
    public String call() {
        return str.concat("Call");
    }
}

class Runner implements Runnable {
    String str;

    public Runner(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str.concat("Run"));
    }
}

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final Future<String> call = executorService.submit(new Caller("Call"));
        final Future<?> run = executorService.submit(new Runner("Run"));
        final String s = (String) call.get();
        final String s1 = (String) run.get();
        System.out.println(s);
        System.out.println(s1);

    }
}
