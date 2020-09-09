package kyocoolcool.exam_v1475.exam73;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 11:26 AM
 **/
public class Test {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta.concat(tb);
        ta.replace("C", "D");
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
