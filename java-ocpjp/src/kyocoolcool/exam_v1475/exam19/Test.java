package kyocoolcool.exam_v1475.exam19;

import lombok.extern.java.Log;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 4:40 PM
 **/
@Log
public class Test {
    public double applyDiscount(double price) {
        assert (price > 0) : "no";
        return price * 0.50;
    }
    public static void main(String[] args) {
        final Test test = new Test();
        final double v = test.applyDiscount(Double.parseDouble(args[0]));
        log.info("new price:"+String.valueOf(v));
    }
}
