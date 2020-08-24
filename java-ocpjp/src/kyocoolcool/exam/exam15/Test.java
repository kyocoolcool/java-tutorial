package kyocoolcool.exam.exam15;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 2:40 PM
 **/
public class Test {
    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "DE":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "no interest for this account";
//                System.out.println("aaa");
        }
        System.out.println("Rate of interest:" + rateOfInterest);
    }
}
