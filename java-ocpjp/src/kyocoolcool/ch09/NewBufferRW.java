package kyocoolcool.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className NewBufferRW
 * @description
 * @date 2020/8/10 4:13 PM
 **/

public class NewBufferRW {
    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("/Users/chris/git/java-tutorial/README.md"), Charset.forName("UTF-8"));
        final BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("/Users/chris/git/java-tutorial/README2.md"),Charset.defaultCharset());
        String string;
        while ((string = bufferedReader.readLine()) != null) {
//            System.out.println(string);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
