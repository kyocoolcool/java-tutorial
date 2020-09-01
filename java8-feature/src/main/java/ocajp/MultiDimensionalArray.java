package ocajp;

/**
 * @ClassName MultiDimensionalArray
 *
 * @Author Chris Chen
 * @Date 2019-07-09 17:30
 * @Version 1.0
 **/

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][] array3D = new int[2][2][2];
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[1][0] = 2;
        array3D[0]=array;
        array3D[1]=array;
        array3D[0][0][0] = 5;
        System.out.println(array3D[0][0][0]);

    }
}