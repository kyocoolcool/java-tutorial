package ocajp.util;

import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName ScannerTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-28 15:05
 * @Version 1.0
 **/

public class ScannerTest {

    @Test
    public void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字");
        int i = scanner.nextInt();
        System.out.println("請輸入字串");
        String next = scanner.next();
        System.out.println("您輸入的數字是:" + i);
        System.out.println("您輸入的字串是:" + next);
        scanner.close();
    }
}