package kyocoolcool.exam.exam169;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 5:15 PM
 **/
public class Test {
    static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
        if (Math.random() > -1)
            throw new Exception("Try again");
    }

    public static void main(String[] args) {
        try {
            doStuff();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

