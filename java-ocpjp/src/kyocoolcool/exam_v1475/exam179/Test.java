package kyocoolcool.exam_v1475.exam179;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 1:59 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/chris/git/java-tutorial/java-ocpjp/resources/Greeting.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("welcome1"));
        System.out.println(prop.getProperty("welcome2", "Test"));//line n1
        System.out.println(prop.getProperty("welcome3"));
    }
}
