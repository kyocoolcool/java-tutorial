package kyocoolcool.exam.exam20;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/11 1:33 PM
 * @Version 1.0
 **/

public class Test {
    public static void sum(int a,int b) {
        System.out.println("int:"+(a+b));
    }
    public static void sum(Integer a,Integer b) {
        System.out.println("Integer:"+(a+b));
    }
    public static void sum(float a,float b) {
        System.out.println("float:"+(a+b));
    }
    public static void sum(double a,double b) {
        System.out.println("double:"+(a+b));
    }
    public static void sum(Double a,Double b) {
        System.out.println("Double:"+(a+b));
    }
    public static void main(String[] args) {
        sum(Integer.valueOf("10"),Integer.valueOf(20));
        sum(10.0,20.0);
    }
}
