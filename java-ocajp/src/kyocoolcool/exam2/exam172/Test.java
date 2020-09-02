package kyocoolcool.exam2.exam172;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/24 3:38 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String[] strings = new String[2];
        int idx = 0;
        for (String string : strings) {
            strings[idx].concat(" element" + idx);
            idx++;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[idx]);

        }
    }
}
