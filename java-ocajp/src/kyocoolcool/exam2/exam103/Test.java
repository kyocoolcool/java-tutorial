package kyocoolcool.exam2.exam103;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 12:32 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }
    }
}
