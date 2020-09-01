package kyocoolcool;

/**
 * @ClassName ItreatorTest
 * 
 * @Author Chris Chen
 * @Date 2019/11/12 12:13 AM
 * @Version 1.0
 **/

public class ItreatorTest {
    public static void main(String[] args) {
        int j = 0, x = 0;
        a:
        for (int i = 0; i < 3; i++) {
            x++;
            b:
            do {
                x += 5;
                if (x > 10) break a;
                j++;
            }
            while (j < 3);
        }
        System.out.println(x);
    }
}