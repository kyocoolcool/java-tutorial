package kyocoolcool.exam2.exam148;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 2:30 PM
 * @Version 1.0
 **/

public class Test {
    int money;
    public void a(Test a) {
        a.money = a.money * a.money;
    }

    @Override
    public String toString() {
        return "Test{" +
                "money=" + money +
                '}';
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.money = 10;
        test.a(test);
        System.out.println(test);
    }
}
