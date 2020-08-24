package kyocoolcool.ch08;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test
 * @description
 * @date 2020/8/6 3:23 PM
 **/

import java.io.*;
public class ConsoleReadInputSample {
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        Console console = System.console();
        if(console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().print("How excited are you about your trip today? ");
            console.flush();
            String excitementAnswer = console.readLine();
            String name = console.readLine("Please enter your name:");
            Integer age = null;
            console.writer().print("What is your age? ");
            console.flush();
            BufferedReader reader = new BufferedReader(console.reader());
            String value = reader.readLine();
            age = Integer.valueOf(value);
            console.writer().println();
            console.format("Your name is "+name);
            console.writer().println();
            console.format("Your age is "+age);
            console.printf("Your excitement level is: "+excitementAnswer);
        }
    }
}