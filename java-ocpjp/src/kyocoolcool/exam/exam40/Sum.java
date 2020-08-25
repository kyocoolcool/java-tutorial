package kyocoolcool.exam.exam40;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 3:36 PM
 **/
public class Sum extends RecursiveTask<Integer> { //line n1
    static final int THRESHOLD_SIZE = 3;
    int stIndex, lstIndex;
    int[] data;


    public Sum(int[] data, int start, int end) {
        this.data = data;
        this.stIndex = start;
        this.lstIndex = end;
    }

    @Override
    protected Integer compute() {
        Integer sum = 0;
        if (lstIndex - stIndex <= THRESHOLD_SIZE) {
            for (int i = stIndex; i < lstIndex; i++) {
                sum += data[i];
            }
//            System.out.println(sum);
            return sum;
        } else {
            final ForkJoinTask<Integer> fork = new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
            return new Sum(data, stIndex,
                    Math.min(lstIndex, stIndex + THRESHOLD_SIZE)
            ).compute()+fork.join();
        }
    }
        //    protected void compute() {
//        Integer sum = 0;
//        if (lstIndex - stIndex <= THRESHOLD_SIZE) {
//            for (int i = stIndex; i < lstIndex; i++) {
//                sum += data[i];
//            }
//            System.out.println(sum);
//        } else {
//            new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
//            new Sum(data, stIndex,
//                    Math.min(lstIndex, stIndex + THRESHOLD_SIZE)
//            ).compute();
//        }
//    }

        public static void main (String[]args){
            ForkJoinPool fjPool = new ForkJoinPool();
            int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            final Integer invoke = fjPool.invoke(new Sum(data, 0, data.length));
            System.out.println(invoke);
        }
    }
