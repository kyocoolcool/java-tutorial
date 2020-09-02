package kyocoolcool.exam.exam19;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/11 11:47 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        int count = 0;
        for (int i : array) {
            switch (i) {
                case 1:
                case 2:
                    count -= 1;
                    break;
//                    continue;
                case 3:
                    count++;
                    continue;
                case 4:
                    count += 2;
                    continue;
            }
        }
        System.out.println(count);
    }
}
