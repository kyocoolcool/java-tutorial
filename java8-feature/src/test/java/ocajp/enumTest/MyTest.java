package ocajp.enumTest;

import ocajp.extend.MailSender;
import ocajp.extend.SendFactory;
import ocajp.extend.SmsSender;
import org.junit.Test;

/**
 * @ClassName MyTest
 * 
 * @Author Chris Chen
 * @Date 2019-05-28 16:50
 * @Version 1.0
 **/

public class MyTest {

    @Test
    public void test1() {
        boolean x = true;
        float f1 = 32345.123_256f;
        double f2 = 36345.1e34d;
        System.out.println(f2);
    }

    @Test
    public void test2() {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String a = "Java";
        String b = "Java";
        System.out.println(a == b);
        System.out.println(s1 == s2);
        int m[][] = new int[2][];
        m[0] = new int[3];
        m[1] = new int[2];
    }

    @Test
    public void test3() {
        int[][] ints = {{0, 1, 2}, {3, 4, 5, 6}};
        System.out.println(ints[0][2]);
        System.out.println(ints[1].getClass().isArray());
        int[] s = {1, 2, 3, 4, 5};
        System.arraycopy(s, 2, s, 1, 2);
        System.out.println(s[1]);
        System.out.println(s[3]);
    }

    @Test
    public void test4() {
        Long i = 3L;
        switch (i.intValue()) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
        }
    }

    /**
     * @param
     * @description: 簡單工廠模式
     * @return: void
     * @author: Chris Chen
     * @time: 2019-05-30 15:02
     */
    @Test
    public void test5() {
        SendFactory factory = new SendFactory();
        SmsSender sender = (SmsSender) factory.produce("sms");
        sender.Send();
        sender.Hi();
    }

    @Test
    public void test6() {
        myLoop:
        for (int i = 0; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test7() {
        String exam[][] = {{"a", "b", "c"}, {"d", "e", "f"}};
        A:
        for (String[] strings : exam) {
            B:
            for (String s : strings) {
                System.out.println(s);
                continue A;
            }
            break;
        }
    }

    public void good() {
        System.out.println("good");
        good2();
    }

    public static void good2() {
        System.out.println("good2");
//        good();
    }

    @Test
    public void test8() {
        good();
    }

    public int plus(int b, int... a) {
        int sum = b;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    @Test
    public void test9() {
        System.out.println(plus(1, 2, 3, 4));
    }

    @Test
    public void test10() {
        MailSender mailSender = new MailSender();
        mailSender.Good();
        mailSender.good();
    }

    @Test
    public void test11() {
//        System.out.println(Week.Friday);
//        Week week = Week.Friday;
//        System.out.println(week.name());
//        System.out.println(Week.valueOf("Saturday"));
//        System.out.println(Week.valueOf(Week.class,"Sunday"));
        System.out.println(Week.Monday);
        System.out.println(Week.Thirsday);
        Week.Monday.hello();
        System.out.println(Week.day.today);

    }



}