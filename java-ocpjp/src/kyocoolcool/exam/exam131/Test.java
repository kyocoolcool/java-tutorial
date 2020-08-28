package kyocoolcool.exam.exam131;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 11:35 AM
 **/

enum Course {
    JAVA(100), J2EE(150);
    private int cost;

    private Course(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}

public class Test {
    public static void main(String[] args) {
        for (Course value : Course.values()) {
            System.out.println(value + "," + value.getCost());
        }
    }
}
