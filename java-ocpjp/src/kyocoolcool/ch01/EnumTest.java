package kyocoolcool.ch01;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className EnumTest
 * @description
 * @date 2020/6/18 5:17 PM
 **/

public class EnumTest {
    public static void main(String[] args) {
        for (Season value : Season.values()) {
            System.out.println(value.ordinal()+": "+value.name());
        }

        final Season spring = Season.SPRING;
        switch (spring) {
            case SPRING:
                System.out.println("SPRING coming");
                break;
            case SUMMER:
                System.out.println("SUMMER coming");
                break;
            case FALL:
                System.out.println("FALL coming");
                break;
            case WINTER:
                System.out.println("WINTER coming");
                break;
            default:
                System.out.println("default season");
        }
    }


}
