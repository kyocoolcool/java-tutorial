package kyocoolcool.exam_v1495.exam30;

public enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;

    USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

