package kyocoolcool.ch08;

import java.io.*;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FileTest
 * @description
 * @date 2020/8/4 6:19 PM
 **/

public class FileTest {
    public static void main(String[] args) {
        System.out.println(File.separator);
        System.out.println(System.getProperty("file.separator"));
        try (FileInputStream fileInputStream = new FileInputStream("/Users/chris/git/java-tutorial/java-ocpjp/resources/testdoc.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("/Users/chris/git/java-tutorial/java-ocpjp/resources/testdocCopy.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {

//        final char read = (char)fileInputStream.read();
//        System.out.println(read);
//        System.out.println((char)fileInputStream.read());
//        System.out.println((char)fileInputStream.read());
//        System.out.println((char)fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());

//        final ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            final byte[] bytes = new byte[1024];
//        final int read = bufferedInputStream.read(bytes);
//        bufferedInputStream.read(bytes);
//        System.out.println(objectInputStream.readObject());
            int a;
            while ((a = bufferedInputStream.read(bytes)) > 1) {
                bufferedOutputStream.write(bytes, 0, a);
                bufferedOutputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
