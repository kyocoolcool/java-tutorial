package kyocoolcool.exam_v1495.exam105;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/19 10:41 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1,2, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        for (int[] a : arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
