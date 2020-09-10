package kyocoolcool.exam_v1475.exam135;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 9:57 AM
 **/
 enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;

    private USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Test {
    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }
}
