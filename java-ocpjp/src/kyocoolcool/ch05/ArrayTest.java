package kyocoolcool.ch05;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ArrayTest
 * @description
 * @date 2020/7/22 11:40 AM
 **/

public class ArrayTest {
    public static void main(String[] args) {
        final String[][] objects =new String[][] {{"hello","Hello"}, {"hiHi"}};
        System.out.println(objects[0][1]);
        System.out.println(objects[1][0]);
    }
}
