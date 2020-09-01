package ocajp.thread;

/**
 * @ClassName ThreadTestStart
 * 
 * @Author Chris Chen
 * @Date 2019-06-03 10:45
 * @Version 1.0
 **/

public class ThreadTestStart {
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        ThreadTest test2 = new ThreadTest();
        test.setName("T1");
        test2.setName("T2");
        test2.setPriority(Thread.MAX_PRIORITY);
//        thread first = new thread(ExceptionTest, "First");
//        thread second = new thread(ExceptionTest, "Second");
        test.start();
        test2.start();
    }
}