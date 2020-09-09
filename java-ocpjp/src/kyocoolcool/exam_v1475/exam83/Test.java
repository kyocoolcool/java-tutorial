package kyocoolcool.exam_v1475.exam83;

import java.util.ResourceBundle;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 2:37 PM
 **/
public class Test {
    public static void main(String[] args) {
        final ResourceBundle rb = ResourceBundle.getBundle("Greeting");
        String result=rb.getString("HELLO_MSG");
        System.out.println(result);
    }
}
