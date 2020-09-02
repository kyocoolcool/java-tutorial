package kyocoolcool.exam.exam69;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/17 1:42 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] a = {"A", "B"};
        int idx = 0;
        for (String s : a) {
            a[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < a.length; idx++) {
            System.out.println(a[idx]);
        }
    }
}
