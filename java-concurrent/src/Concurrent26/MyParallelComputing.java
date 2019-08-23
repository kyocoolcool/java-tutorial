package Concurrent26;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName MyParallelComputing
 * @Description 並行計算
 * @Author Chris Chen
 * @Date 2019-08-09 16:32
 * @Version 1.0
 **/

public class MyParallelComputing {

    public static void main(String[] args) {
        //第一種方式
        long start = System.currentTimeMillis();
        List<Integer> prime = getPrime(1, 200000);
        long end = System.currentTimeMillis();
        System.out.println(prime);
        System.out.println(end - start);

        //第二種方式 並行計算效能更優
        long start1 = System.currentTimeMillis();
        final int cpuCoewNum = 4;
        ExecutorService service = Executors.newFixedThreadPool(cpuCoewNum);
        MyTask myTask1 = new MyTask(1, 80000);
        MyTask myTask2 = new MyTask(80001, 130000);
        MyTask myTask3 = new MyTask(130001, 170000);
        MyTask myTask4 = new MyTask(170001, 200000);
        Future<List<Integer>> future1 = service.submit(myTask1);
        Future<List<Integer>> future2 = service.submit(myTask2);
        Future<List<Integer>> future3 = service.submit(myTask3);
        Future<List<Integer>> future4 = service.submit(myTask4);

        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(future1.get());
            list.addAll(future2.get());
            list.addAll(future3.get());
            list.addAll(future4.get());
            System.out.println(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
        service.shutdown();//若線程池沒有要使用必須關閉
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static List<Integer> getPrime(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) list.add(i);
        }
        return list;
    }

    static class MyTask implements Callable<List<Integer>> {
        int startPos, endPos;

        public MyTask(int startPos, int endPos) {
            this.startPos = startPos;
            this.endPos = endPos;
        }

        @Override
        public List<Integer> call() throws Exception {
            List<Integer> prime = getPrime(startPos, endPos);
            return prime;
        }
    }

}