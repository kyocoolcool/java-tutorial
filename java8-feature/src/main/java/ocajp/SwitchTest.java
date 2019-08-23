package ocajp;

/**
 * @ClassName SwitchTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-07-10 18:15
 * @Version 1.0
 **/

public class SwitchTest {

    volatile int a = 5;

    public static void main(String[] args) {
        String color = "no";
        switch (color) {
            case "red":
                System.out.println("red");
            case "blue":
                System.out.println("blue");
//                break;
            case "yello":
                System.out.println("yello");
                break;
            default:
                System.out.println("default");
        }
        SwitchTest switchTest = new SwitchTest();

        System.out.println(switchTest.a);
    }

}