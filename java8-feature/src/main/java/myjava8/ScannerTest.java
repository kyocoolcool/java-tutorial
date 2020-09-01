package myjava8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @ClassName ScannerTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-28 15:12
 * @Version 1.0
 **/

public class ScannerTest {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入數字");
//        int i = scanner.nextInt();
//        System.out.println("請輸入字串");
//        String next = scanner.next();
//        System.out.println("您輸入的數字是:" + i);
//        System.out.println("您輸入的字串是:" + next);
//        scanner.close();
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner("100,Java");
//        scanner.useDelimiter(",");
//        System.out.println("請輸入數字");
//        int i = scanner.nextInt();
//        System.out.println("請輸入字串");
//        String next = scanner.next();
//        System.out.println("您輸入的數字是:" + i);
//        System.out.println("您輸入的字串是:" + next);
//        scanner.close();
//    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("aaa.txt"));
        scanner.useDelimiter(",|#");
        System.out.println("下單資訊");
        float cost = 0;
        while (scanner.hasNextInt()) {
            int sNo = scanner.nextInt();
            String sName = scanner.next();
            float price = scanner.nextFloat();
            int qut = scanner.nextInt();
            System.out.println("-----------------");
            System.out.println("股票代號:"+sNo);
            System.out.println("股票名稱:"+sName);
            System.out.println("成交價格: NT."+price);
            System.out.println("委託張數: NT."+qut);
            cost += qut * price * 1000;
        }
        System.out.println("-----------------");
        System.out.printf("總成本 :NT. %,.2f%n",cost);
        scanner.close();
    }
}
