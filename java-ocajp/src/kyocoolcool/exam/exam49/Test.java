package kyocoolcool.exam.exam49;

/**
 * @ClassName exam49
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/12 1:38 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[][] n = {{1,3},{2,4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.println(y);
            }
        }
    }
}
