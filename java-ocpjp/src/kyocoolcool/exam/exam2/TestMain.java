package kyocoolcool.exam.exam2;

import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/21 3:58 PM
 **/
public class TestMain {
    public static void main(String[] args) {
//        final boolean hello = new TestIterface() {
//            @Override
//            public boolean hello(String hello) {
//                return hello.length() > 4 && hello.length() < 10;
//            }
//        }.hello("hello");
//
//        System.out.println(hello);

//        final TestIterface testIterface =(String s) -> s.length() < 10;
//        System.out.println(testIterface.hello("1111111111111111"));
        final Predicate<String> stringFilter = (String x) -> x.length() > 10;
        final TestIterface stringFilter2 = (String x) -> x.length() > 10;
        System.out.println(stringFilter2.hello("11111111111111111"));
    }
}
