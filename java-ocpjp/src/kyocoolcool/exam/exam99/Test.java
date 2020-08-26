package kyocoolcool.exam.exam99;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 6:39 PM
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Instant logInTime = Instant.now();
        Thread.sleep(1000);
        Instant logOutTime = Instant.now();
        logInTime = logInTime.truncatedTo(ChronoUnit.MINUTES);
        logOutTime = logOutTime.truncatedTo(ChronoUnit.SECONDS);
        System.out.println(logInTime);
        System.out.println(logOutTime);
        if (logOutTime.isAfter(logInTime)) {
            System.out.println("logout"+logOutTime);
        } else {
            System.out.println("can't logout");
        }
    }
}
