package kyocoolcool.exam.exam46;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 5:58 PM
 **/
public class Test implements AutoCloseable{
    public void copyToTable() {

    }

    public void close() throws Exception{
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        try(Test aa=new Test()) {
            System.out.println("hello");
        }
//        catch (Exception e) {
//
//        }
    }
}
