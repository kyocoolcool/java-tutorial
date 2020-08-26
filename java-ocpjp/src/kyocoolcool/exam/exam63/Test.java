package kyocoolcool.exam.exam63;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 11:16 AM
 **/
public class Test<T,S extends T> {

    public static void main(String[] args) {
        final Test<Number, Integer> numberIntegerTest = new Test<>();
        final Test<Object, String> numberIntegerTest2 = new Test<Object,String>();

    }
}
