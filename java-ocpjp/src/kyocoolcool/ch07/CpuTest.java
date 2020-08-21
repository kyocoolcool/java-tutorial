package kyocoolcool.ch07;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className CpuTest
 * @description
 * @date 2020/7/28 7:02 PM
 **/

public class CpuTest {
    public static void main(String[] args) {
        final int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
