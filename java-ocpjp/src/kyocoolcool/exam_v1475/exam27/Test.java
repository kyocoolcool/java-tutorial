package kyocoolcool.exam_v1475.exam27;

import java.util.concurrent.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 5:26 PM
 **/
class Caller implements Callable<String> {
    String str;

    public Caller(String s) {
        this.str = s;
    }

    public String call() throws Exception {
        return str.concat("Caller");
    }
}

class Runner implements Runnable {
    String str;

    public Runner(String s) {
        this.str = s;
    }

    public void run() {
        System.out.println(str.concat("Runner"));
    }
}

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Caller("Call"));
        Future f2 = es.submit(new Runner("Run"));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();//line n1
        System.out.println(str1 + ":" + str2);
    }
}
