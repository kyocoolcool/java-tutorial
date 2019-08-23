package kyocoolcool.forkJoin;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName ForkJoinCalculate
 * @Description TODO
 * @Author chris
 * @Date 2019-04-12 23:22
 * @Version 1.0
 **/

public class ForkJoinCalculate extends RecursiveTask {

    private long start;
    private long end;
    private static final long THRESHOLD=10000;

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public ForkJoinCalculate() {
    }

    public ForkJoinCalculate(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long  length = end - start;

        if (length<=THRESHOLD) {
            long sum=0;
            for (long i=start;i<=end;i++){
                sum+=i;
            }
            return sum;
        } else {
            long middle = (start + end) / 2;
            ForkJoinCalculate left = new ForkJoinCalculate(start,middle);
            left.fork();
            ForkJoinCalculate right = new ForkJoinCalculate(middle+1,end);
            right.fork();

            return (long) left.join()+(long) right.join();

        }
    }
}