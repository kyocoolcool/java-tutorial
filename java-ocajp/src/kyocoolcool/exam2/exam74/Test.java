package kyocoolcool.exam2.exam74;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/23 10:41 PM
 * @Version 1.0
 **/

public class Test {
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer");
    }
    public static void doSum(double x, double y) {
        System.out.println("double");
    }
    public static void doSum(float x, float y) {
        System.out.println("float");
    }
    public static void doSum(int x, int y) {
        System.out.println("int");
    }
    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
    }
}
