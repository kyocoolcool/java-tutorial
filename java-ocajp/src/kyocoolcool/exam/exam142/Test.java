package kyocoolcool.exam.exam142;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/20 5:05 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] a=new String[2];
        int idx = 0;
        for (String s : a) {
            s = new String();
            s.concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < a.length; idx++) {
            System.out.println(a[idx]);
        }

        test2();
    }

    public static void test2() {
        System.out.println("v2");
    }
}
