package ocajp;

/**
 * @ClassName ExceptionTest3
 * 
 * @Author Chris Chen
 * @Date 2019-07-09 17:57
 * @Version 1.0
 **/

public class ExceptionTest3 implements ExcetionTest2 {
    @Override
    public void close() throws Exception {
//        try {
//            int a = 3 / 0;
//        } catch (RuntimeException e) {
//            System.out.println("dddd"+e.getMessage());
//        }
        System.out.println("dddd");
        int a = 3 / 0;
        System.out.println("eeee");

    }

    public static void main(String[] args) throws Exception {
        ExceptionTest3 exceptionTest3 = new ExceptionTest3();
//        try {
//            exceptionTest3.close();
//        } catch (Exception e) {
//            System.out.println("ccc" + e.getMessage());
//        }
        System.out.println("aaaa");
        exceptionTest3.close();
        System.out.println("bbbb");
    }
}