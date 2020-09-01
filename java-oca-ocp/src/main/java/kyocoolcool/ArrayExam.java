package kyocoolcool;

/**
 * @ClassName ArrayExam
 * 
 * @Author Chris Chen
 * @Date 2019/10/24 11:47 PM
 * @Version 1.0
 **/

public class ArrayExam {
    public static void main(String[] args) {
        //一定要先宣告最左邊的範圍，右邊可以再後續擴增
        int[][] arr = new int[2][0];
        arr[0] = new int[3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1] = new int[4];
        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;
        arr[1][3] = 40;
//        產生index out of bound exception
//        arr[2] = new int[2];
//        arr[2][0] = 1;
//        arr[2][1] = 2;

        int[] ints = new int[5];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;
        ints[3] = 3;
        ints[4] = 4;
    }
}