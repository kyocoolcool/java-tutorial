package ocajp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/**
 * @ClassName Banana
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-03 16:51
 * @Version 1.0
 **/

public class Banana implements Executor ,Runnable{
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }

    @Override
    public void run() {
        System.out.println("hhhhh");
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Banana executor = new Banana();
        executor.execute(new Banana());
        executor.execute(new Banana());
        executor.execute(new Banana());
//        FutureTask<Integer> integerFutureTask = new FutureTask<>(new Lotto());
//        new thread(integerFutureTask).start();
//        System.out.println("開始跑囉");
//        System.out.println("幸運數字:"+integerFutureTask.get());
    }


}