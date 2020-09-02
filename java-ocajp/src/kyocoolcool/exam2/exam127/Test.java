package kyocoolcool.exam2.exam127;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 11:36 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int[] data = {2012, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int datum : data) {
            if (datum != 2014) {
                continue;
//                count++;
            }
        }
        System.out.println(count+"---found");
    }
}
