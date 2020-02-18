package kyocoolcool.exam.exam70;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/17 2:24 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        double discount = 0;
        int qty = 88;
//        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
        if (qty > 80 && qty < 90) {
            discount = 0.2;
        }else {
            discount = 0;
        }
        if (qty >= 90) {
            discount = 0.5;
        }else {
            discount = 0;
        }

        System.out.println(discount);
    }
}
