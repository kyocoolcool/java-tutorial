package kyocoolcool.exam_v1475.exam129;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Test {
    public static void main(String[] args)  {
        try {
            List<String>   strings = Files.readAllLines(Paths.get("C:\\Users\\Jin-Chang\\Documents\\projects\\java-tutorial\\java-ocpjp\\resources\\testdoc.txt"));

            strings.stream().forEach(line -> {
                try {
                    Files.write(Paths.get("C:\\Users\\Jin-Chang\\Documents\\projects\\java-tutorial\\java-ocpjp\\resources\\testdoc2.txt"), line.getBytes(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println("11111111");
                }
            });
        } catch (IOException e) {
            System.out.println("222222");
        }


    }
}
