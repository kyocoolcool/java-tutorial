package kyocoolcool.exam_v1475.exam15;

import lombok.extern.java.Log;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 4:20 PM
 **/
@Log
public class Test {
    public static void display(int[] nums) {
        try {
            log.info(String.valueOf(nums[1] / nums[1] - nums[2]));
        } catch (ArithmeticException exception) {
            log.info("first");
        }
        log.info("done");

    }
    public static void main(String[] args) {
        try {
            int[] arr = {100, 100};
            display(arr);
        } catch (IllegalArgumentException exception) {
            log.info("second");
        } catch (Exception exception) {
            log.info("third");
        }


    }
}
