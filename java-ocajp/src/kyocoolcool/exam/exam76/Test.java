package kyocoolcool.exam.exam76;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/17 2:59 PM
 * @Version 1.0
 **/

public class Test {
    String name;
    boolean contract;
    double salary;

    public Test() {
        name = "JOE";
        contract = true;
        salary = 100.0f;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", contract=" + contract +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        final Test test = new Test();
        System.out.println(test);
    }
}
