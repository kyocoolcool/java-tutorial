package kyocoolcool.exam_v1475.exam95;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 4:52 PM
 **/

class Test2 {
    static int aaa = 100;
}

public class Test extends Test2 {
    static boolean doStuff() {
        return !isAvailable;
    }

    public static boolean isAvailable = false;

    public static Integer age;

    int i = 0;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(isAvailable);
        isAvailable = doStuff();
        System.out.println(isAvailable);
        System.out.println(test.i);
    }
}
