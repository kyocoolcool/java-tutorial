package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FinalTest
 * @description
 * @date 2020/6/20 10:19 AM
 **/

public class FinalTest {
    String a;
    Integer b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "FinalTest{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        final FinalTest finalTest = new FinalTest();
//        finalTest.setA("hello.txt");
//        finalTest.setB(100);
        System.out.println(finalTest);
    }
}
