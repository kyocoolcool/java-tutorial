package kyocoolcool.exam2.exam73;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/23 10:38 PM
 * @Version 1.0
 **/

public class Test {
    String name;
    boolean contract;
    double salary;

    public Test() {
        name = "Joe";
        contract = true;
    }

    public static void main(String[] args) {
        final Test test = new Test();
        System.out.println(test);
    }
}
