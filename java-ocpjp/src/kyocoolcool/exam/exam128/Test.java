package kyocoolcool.exam.exam128;

import java.io.*;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 上午 12:50
 **/
public class Test {
    public static void main(String[] args) {
        try (final FileInputStream fileInputStream = new FileInputStream("C:\\Users\\陳金昌\\Documents\\projects\\java-tutorial\\version.txt");
             final InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             final BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ){
            if (bufferedReader.markSupported()) {

                final char c =(char) bufferedReader.read();
                System.out.println(c);
                bufferedReader.mark(3);
                final char c1 =(char) bufferedReader.read();
                System.out.println(c1);
//                bufferedReader.reset();
//                final char c2 =(char) bufferedReader.read();
                final String c2 = bufferedReader.readLine();
                System.out.println(c2);
                final String c4 = bufferedReader.readLine();
                System.out.println(c4);
                bufferedReader.readLine();
                bufferedReader.readLine();
                bufferedReader.readLine();
                bufferedReader.readLine();
                bufferedReader.readLine();
                bufferedReader.readLine();
                bufferedReader.reset();
                final char c3 =(char) bufferedReader.read();
                System.out.println(c3);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}