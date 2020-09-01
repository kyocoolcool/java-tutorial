package ocajp.thread;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @ClassName Lotto
 *
 * @Author Chris Chen
 * @Date 2019-06-03 16:50
 * @Version 1.0
 **/

public class Lotto implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int i= (int)(Math.random()* 100);
        System.out.println("獲得號碼:"+i+"  "+new Date());
        return i;
    }


}