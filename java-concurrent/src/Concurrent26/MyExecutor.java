package Concurrent26;

import java.util.concurrent.Executor;

/**
 * @ClassName MyExecutor
 * @Description Executor 線程執行器原始父類別
 * @Author Chris Chen
 * @Date 2019-08-08 17:31
 * @Version 1.0
 **/

public class MyExecutor implements Executor {
    public static void main(String[] args) {
        new MyExecutor().execute(()-> System.out.println("Hello executor"));
    }


    @Override
    public void execute(Runnable command) {
         command.run();
    }
}