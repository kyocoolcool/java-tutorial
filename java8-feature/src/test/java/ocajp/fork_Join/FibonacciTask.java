package ocajp.fork_Join;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName FibonacciTask
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-06 17:36
 * @Version 1.0
 **/

public class FibonacciTask extends RecursiveTask<Integer> {
    private Integer num = 0;
    private Integer result = 0;

    public Integer getNum() {
        return num;
    }

    public Integer getResult() {
        return result;
    }

    public FibonacciTask(Integer num) {
        this.num = num;
    }

    @Override
    protected Integer compute() {
        if (num < 29) {
            result = new Fork_Join().fibonacci(num);
        }
        else {
            FibonacciTask fibonacciTask = new FibonacciTask(num - 1);
            fibonacciTask.fork();
            FibonacciTask fibonacciTask2 = new FibonacciTask(num - 2);
            result = fibonacciTask2.compute() + fibonacciTask.join();
        }
        return result;
    }
}