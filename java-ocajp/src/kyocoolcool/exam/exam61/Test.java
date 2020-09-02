package kyocoolcool.exam.exam61;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/17 11:23 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta=ta.replace("C", "D");
        ta=ta.concat(tb);
        System.out.println(ta);
    }
}
