package kyocoolcool.forkJoin;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * @ClassName ForkJoinTest
 * @Description TODO
 * @Author chris
 * @Date 2019-04-13 00:43
 * @Version 1.0
 **/

public class ForkJoinTest {
    @Test
    public void test(){
        Instant start = Instant.now();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculate(0,100000L);
        Long sum = forkJoinPool.invoke(task);
        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println("耗費時間: "+Duration.between(start,end).toMillis());
    }

    @Test
    public void test2(){
        Instant start = Instant.now();
        long sum=0L;
        for(long i=0;i<=100000000000L;i++){
            sum+=i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println("耗費時間: "+Duration.between(start,end).toMillis());
    }

    /**
     * @Author chris
     * @Description //順序流
     * @Date 15:06 2019-04-17
     * @Param
     * @return void
     **/
    @Test
    public void test3(){
        Instant start = Instant.now();
        OptionalLong reduce = LongStream.rangeClosed(0, 100000000000L).reduce((x, y) -> Long.sum(x, y));
        System.out.println(reduce.getAsLong());
        Instant end = Instant.now();
        System.out.println("耗費時間: "+Duration.between(start,end).toMillis());
    }

    /**
     * @Author chris
     * @Description //並行流
     * @Date 15:06 2019-04-17
     * @Param
     * @return void
     **/
    @Test
    public void test4(){
        Instant start = Instant.now();
        OptionalLong reduce = LongStream.rangeClosed(0, 100000000000L).parallel().reduce(Long::sum);
        System.out.println(reduce.getAsLong());
        Instant end = Instant.now();
        System.out.println("耗費時間: "+Duration.between(start,end).toMillis());
    }
}