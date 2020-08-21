package kyocoolcool.exam2.exam58;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/21 5:28 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String str : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }

        for ( idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);

        }
    }
}
