package ocajp.exception_Error;

/**
 * @ClassName MyResoirce
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-03 10:03
 * @Version 1.0
 **/

public class MyResoirce implements AutoCloseable{
    public  void hello() {
        System.out.println("say hello");
    }

    @Override
    public void close() throws Exception {
//        System.out.println("Auto Closed");
        throw new Exception("關閉資源");
    }
}