package kyocoolcool.exam_v1495.exam146;

import java.util.concurrent.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 5:01 PM
 **/

class CallerThread implements Callable<String> {
    String str;

    public CallerThread(String str) {
        this.str = str;
    }

    @Override
    public String call() throws Exception {
        return str.concat("call");
    }
}
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService es = Executors.newFixedThreadPool(4);
        final Future<String> call = es.submit(new CallerThread("Call"));
        final String s = call.get().toString();
        System.out.println(s);
        es.shutdown();
    }
}
