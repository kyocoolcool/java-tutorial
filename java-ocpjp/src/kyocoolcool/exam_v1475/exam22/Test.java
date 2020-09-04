package kyocoolcool.exam_v1475.exam22;

import lombok.extern.java.Log;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 5:01 PM
 **/
@Log
public class Test {
     static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            count++;
            i++;
        }
    }

    public static void main(String[] args) {
        final Test test = new Test();
        final Test test2 = new Test();
        test.changeCount();
        test2.changeCount();
        System.out.println(String.valueOf(test.count)+" "+String.valueOf(test2.count));
    }
}
