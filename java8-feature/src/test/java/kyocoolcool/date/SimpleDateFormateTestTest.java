package kyocoolcool.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @ClassName SimpleDateFormateTestTest
 * @Description TODO
 * @Author chris
 * @Date 2019-04-22 09:12
 * @Version 1.0
 **/

public class SimpleDateFormateTestTest {
    //新式寫法:Java8
    @Test
    public void test2() throws Exception{
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Callable<LocalDate> task = (() -> LocalDate.parse("20190421",dtf) );

        ArrayList<Future<LocalDate>> results = new ArrayList<>();
        for (int i=0;i<10;i++){
            results.add(pool.submit(task));
        }
        results.forEach((x)-> {
            try {
                System.out.println(x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        pool.shutdown();
    }

    @Test
    public void test1() throws Exception{
//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Callable<Date> task = (() -> DateFormateThreadLocal.convert("20190421"));

        ArrayList<Future<Date>> results = new ArrayList<>();
        for (int i=0;i<10;i++){
            results.add(pool.submit(task));
        }
        results.forEach((x)-> {
            try {
                System.out.println(x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        pool.shutdown();
    }

}