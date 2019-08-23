package ocajp.fork_Join;

import org.junit.Test;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName fork_Join
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-04 10:12
 * @Version 1.0
 **/

public class Fork_Join {
    public Integer fibonacci(Integer num) {
        if(num==0 || num ==1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }

    @Test
    public void test() {
        Fork_Join fork_join = new Fork_Join();
        Integer fibonacci = fork_join.fibonacci(7);
        System.out.println(fibonacci);
    }

    @Test
    public void test2() {
        Integer num = 40;
        long t1=new Date().getTime();
        System.out.println(new Fork_Join().fibonacci(num));
        long t2=new Date().getTime();
        System.out.println("所花費時間:"+(t2-t1));
        long t3=new Date().getTime();
        int processors = Runtime.getRuntime().availableProcessors();
        FibonacciTask fibonacciTask = new FibonacciTask(num);
        ForkJoinPool forkJoinPool = new ForkJoinPool(processors);
        forkJoinPool.invoke(fibonacciTask);
        System.out.println(fibonacciTask.getResult());
        long t4=new Date().getTime();
        System.out.println("花費時間:"+(t4-t3));
        System.out.println("processors"+processors);
    }
}