package kyocoolcool.exam_v1475.exam7;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 3:16 PM
 **/
public class Test {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7, 9};
        arr2 = arr1;
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
}
