package kyocoolcool.exam_v1495.exam17;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/11 11:36 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int key = 4;
        int count = 0;
        b:for (int x = 0; x < 3; x++) {
            System.out.println("b執行");
            a: for (int i : array) {
                System.out.println("a執行");
                if (i != key) {
                    continue a;
                }

            }
        }
        System.out.println(count + ":found");
    }
}
