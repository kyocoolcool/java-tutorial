package kyocoolcool;

import org.junit.Test;

import java.util.Date;

/**
 * @ClassName CodeTransfer
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-05-13 10:13
 * @Version 1.0
 **/

public class CodeTransfer {
    public String a = "D ";
    @Test
    public void test() {
        System.out.println(a.trim());
    }

    @Test
    public void test2() {
        Date date = new Date();
        System.out.println(date.getTime());
    }

    @Test
    public void test3() {
        char a = 'a';
        char b= 65;
        char c = '\u4E2d';
        char d = '\\';
        char e = 20013;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        byte z = 0b1101;
        byte x = 017;
        System.out.println(z);
        System.out.println(x);

    }
}