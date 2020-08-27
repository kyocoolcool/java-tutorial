package kyocoolcool.exam.exam118;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 下午 09:51
 **/
public class Test {
    public void doStuff(String s) {
        try {
        if (s == null) {
            throw new NullPointerException();
        }
        }finally {
            System.out.println("finally");
        }
        System.out.println("doStuff");

    }
    public static void main(String[] args) {
        try {
            new Test().doStuff(null);
        } catch (NullPointerException exception) {
            System.out.println("catch");
        }
    }
}