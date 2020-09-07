package kyocoolcool.exam_v1475.exam41;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 3:53 PM
 **/
public class Test {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers=new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
