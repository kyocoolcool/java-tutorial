package kyocoolcool.exam_v1475.exam195;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 8:30 PM
 **/
class Sum2 extends RecursiveTask<Integer> { //line n1
    static final int THRESHOLD_SIZE = 3;
    int stIndex, lstIndex;
    int[] data;

    public Sum2(int[] data, int start, int end) {
        this.data = data;
        this.stIndex = start;
        this.lstIndex = end;
    }

    protected Integer compute() {
        int sum = 0;
        if (lstIndex-stIndex<=THRESHOLD_SIZE){
            for (int i = stIndex; i < lstIndex; i++) {
                sum += data[i];
            }
            System.out.println(sum);
        } else{
            Sum2 subtaskA = new Sum2(data, stIndex + THRESHOLD_SIZE,  lstIndex);
            Sum2 subtaskB = new Sum2(data, stIndex,    Math.min(lstIndex, stIndex + THRESHOLD_SIZE));

            subtaskA.fork();
            subtaskB.fork();
//            final int i1 = subtaskA.join() + subtaskB.join();
            sum+=subtaskA.join()+subtaskB.join();
        }
        return sum;
    }
}

public class Test2 {
    public static void main(String[] args) {
        ForkJoinPool fjPool = new ForkJoinPool();
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final Integer invoke = fjPool.invoke(new Sum2(data, 0, data.length));
        System.out.println(invoke);
    }
}
