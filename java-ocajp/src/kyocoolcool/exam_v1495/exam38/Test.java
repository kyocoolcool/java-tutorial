package kyocoolcool.exam_v1495.exam38;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/11 6:23 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] names = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];
        int idx = 0;
        try {
            for (String name : names) {
                pwd[idx] = name.substring(2, 6);
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid name");
        }
        for (String s : pwd) {
            System.out.println(s);
        }
    }
}
