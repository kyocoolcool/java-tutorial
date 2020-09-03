package kyocoolcool.exam_v1495.exam23;

import java.io.Console;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/24 5:21 PM
 **/
public class Test2 {
    public static void main(String[] args) {
        Console cnsl = null;
        String alpha = null;

        try{
            // creates a console object
            cnsl = System.console();

            // if console is not null
            if (cnsl != null) {

                // read line from the user input
                alpha = cnsl.readLine("Name: ");

                // prints
                System.out.println("Name is: " + alpha);

                // read password into the char array
                char[] pwd = cnsl.readPassword("Password: ");
                System.out.println("Password is: ");
                for (int i = 0; i < pwd.length; i++) {
                    System.out.print(pwd[i]);
                }
            }
        }catch(Exception ex){

            // if any error occurs
            ex.printStackTrace();
        }
    }
}
