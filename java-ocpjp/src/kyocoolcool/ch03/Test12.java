package kyocoolcool.ch03;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test12
 * @description
 * @date 2020/7/14 11:41 AM
 **/

public class Test12 {
    public static <U extends Exception> void print(U u) {
        System.out.println(u.getMessage());
    }
    public static void main(String[] args) {
        Test12.print(new Exception("exception"));
        Test12.print(new NullPointerException("nullPointerException"));
        Test12.<ClassCastException>print(new ClassCastException("ClassCastException"));
        Test12.<Exception>print(new ClassCastException("ClassCastException"));
//        Test12.print(new Throwable("aaaa"));
    }
}
