package kyocoolcool.exam.exam25;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/11 2:10 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[] ints = new int[2];
        ints[0] = 10;
        ints[1] = 20;
        ints = new int[4];
        ints[2] = 30;
        ints[3] = 40;
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
