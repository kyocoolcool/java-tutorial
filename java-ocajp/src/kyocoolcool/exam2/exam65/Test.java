package kyocoolcool.exam2.exam65;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/21 6:15 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
