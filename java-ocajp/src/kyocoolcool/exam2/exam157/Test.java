package kyocoolcool.exam2.exam157;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 2:58 PM
 * @Version 1.0
 **/



public class Test {
    public static final int MIN = 1;
    public static void main(String[] args) {
        final int length = args.length;
        if (check(length)) {
            System.out.println("SE");
        }
        else {
            System.out.println("EE");
        }

    }

    public static boolean check(int i) {
        return (i >= MIN) ? true : false;
    }
}
