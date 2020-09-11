package kyocoolcool.exam_v1475.exam192;


import java.util.function.Predicate;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 2:37 PM
 **/
//interface A {
//    public boolean check(String str);
//}
public class Test {
    public static void main(String[] args) {
        final boolean result = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return str.length() > 5 && str.length() < 10;
            }
        }.test("hello");
        System.out.println(result);
    }
}
