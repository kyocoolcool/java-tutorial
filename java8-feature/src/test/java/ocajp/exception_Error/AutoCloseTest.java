package ocajp.exception_Error;

/**
 * @ClassName AutoCloseTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-03 10:04
 * @Version 1.0
 **/

public class AutoCloseTest {
    public static void main(String[] args) {
        try (MyResoirce myResoirce = new MyResoirce();) {
            myResoirce.hello();
            throw new Exception("AAAA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            System.out.println("got it");
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println(throwable);
            }
        }
    }
}