package kyocoolcool.exam.exam9;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/9 5:26 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int x = array.length;
        while (x > 0) {
            System.out.println(array[--x]);
        }
    }
}
