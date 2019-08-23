package Concurrent26;

import java.util.concurrent.Callable;

/**
 * @ClassName MyCallable
 * @Description Callable運行完會有返回值，Runnable則沒有返回值
 * @Author Chris Chen
 * @Date 2019-08-09 13:24
 * @Version 1.0
 **/

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return null;
    }
}