package kyocoolcool.exam_v1495.exam172;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 02:39
 **/
class UserException extends Exception {
}

class AgeOutOfLimitException extends UserException {
}

public class App {
    public void doRegister(String name, int age)
            throws UserException, AgeOutOfLimitException {
        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered.");
        }
    }

    public static void main(String[] args) throws UserException {
        App t = new App();
        t.doRegister("Mathew", 60);
    }
}