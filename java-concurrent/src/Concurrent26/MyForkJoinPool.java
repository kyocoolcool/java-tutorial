package Concurrent26;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 * @ClassName MyForkJoinPool
 * @Description RecursiveAction:沒有返回值，RecursiveTask:有返回值
 * @Author Chris Chen
 * @Date 2019-08-11 11:50
 * @Version 1.0
 **/

public class MyForkJoinPool {
    static int[] nums = new int[1000000];
    static final int MAX_NUM = 50000;
    static Random random = new Random();

    /*第一種單線程計算方式*/
    static {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.stream(nums).sum());
    }


    static class AddTask extends RecursiveTask<Long> {
        int start, end;

        public AddTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if (end - start <= MAX_NUM) {
                long sum = 0L;
                for (int i = start; i < end; i++) {
                    sum += nums[i];
                }
                System.out.println("from:" + start + " to:" + (end - 1) + " = " + sum);
                return sum;
            } else {
                int middle = start + (end - start) / 2;
                AddTask subTask1 = new AddTask(start, middle);
                AddTask subTask2 = new AddTask(middle, end);
                subTask1.fork();
                subTask2.fork();
                return subTask1.join() + subTask2.join();
            }
        }

        public static void main(String[] args) throws IOException {
            ForkJoinPool fkp = new ForkJoinPool();
            AddTask task = new AddTask(0, nums.length);
            fkp.execute(task);
            Long result = task.join();/*會阻塞*/
            System.out.println(result);

            /*Demon線程需要阻塞*/
//            System.in.read();

        }
    }


}