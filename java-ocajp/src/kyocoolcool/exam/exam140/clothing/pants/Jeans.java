package kyocoolcool.exam.exam140.clothing.pants;

import static kyocoolcool.exam.exam140.clothing.Shirt.getColor;

/**
 * @ClassName Jeans
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/20 4:55 PM
 * @Version 1.0
 **/

public class Jeans {
    public void matchShirt() {
        String color = getColor();
        if (color.equals("Green")) {
            System.out.println("FIT");
        }
    }

    public static void main(String[] args) {
        final Jeans jeans = new Jeans();
        jeans.matchShirt();
    }
}
