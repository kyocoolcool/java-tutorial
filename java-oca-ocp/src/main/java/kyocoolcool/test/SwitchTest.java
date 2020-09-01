package kyocoolcool.test;

/**
 * @ClassName SwitchTest
 *
 * @Author Chris Chen
 * @Date 2019/11/11 10:09 PM
 * @Version 1.0
 **/

public class SwitchTest {
    public static void main(String[] args) {
        int y=70;
        switch (y) {
            case 70: System.out.println("破關");
            break;
            case 52: System.out.println("變死騎");
                break;
            case 5: {
                System.out.println("得到匕首");
                break;
            }
            default:
                System.out.println("升級");
        }
    }
}