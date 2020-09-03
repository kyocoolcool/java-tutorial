package kyocoolcool.exam_v1495.exam165;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/31 4:01 PM
 **/
public class Test {
    public static void main(String[] args) {
        try (final FileReader fileReader = new FileReader("data.txt");
             final BufferedReader bufferedReader = new BufferedReader(fileReader);
             final FileWriter fileWriter = new FileWriter("allData.txt");
             final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.append(line);
            }
//            bufferedWriter.close();
            bufferedWriter.newLine();
            bufferedWriter.append("123");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
