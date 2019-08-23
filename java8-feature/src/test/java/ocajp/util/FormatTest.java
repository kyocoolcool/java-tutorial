package ocajp.util;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 * @ClassName FormatTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-28 13:33
 * @Version 1.0
 **/

public class FormatTest {
    @Test
    public void test() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(System.out);
        formatter.format("圓周率=%f", Math.PI);
    }

    @Test
    public void test2() {
        StringBuilder stringBuilder = new StringBuilder("圓周");
        Formatter formatter = new Formatter(stringBuilder);
        formatter.format("率=%f", Math.PI);
        formatter.format(" 記好囉");
        System.out.println(stringBuilder);
    }

    @Test
    public void test3() {
        try {
            Formatter f = new Formatter(new File("/Users/chris/ccc"));
            f.format("圓周率%f", Math.PI);
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}