package ocajp.util;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName MatchTest
 * 
 * @Author Chris Chen
 * @Date 2019-06-28 10:43
 * @Version 1.0
 **/

public class MatchTest {
    @Test
    public void test() {
        Pattern pattern = Pattern.compile("ABC[A-F]{2,3}");
        Matcher matcher1 = pattern.matcher("ABCDE");
        System.out.println(matcher1.matches());
    }

    @Test
    public void test2() {
        Pattern pattern = Pattern.compile("JAVA [EMS]{2}.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher("JAVA SE License");
        System.out.println(matcher1.matches());
        Matcher matcher2 = pattern.matcher("JAVA SE ");
        System.out.println(matcher2.matches());
        Matcher matcher3 = pattern.matcher("JAVA ee License");
        System.out.println(matcher3.matches());
        Matcher matcher4 = pattern.matcher("JAVA ms License");
        System.out.println(matcher4.matches());
        Matcher matcher5 = pattern.matcher("JAVA e");
        System.out.println(matcher5.matches());
        Matcher matcher6 = pattern.matcher("JAVA ab");
        System.out.println(matcher6.matches());
        Matcher matcher7 = pattern.matcher("JAVA ee");
        System.out.println(matcher7.matches());
    }


    @Test
    public void test3() {
        Pattern pattern = Pattern.compile("(?i)JAVA [EMS]{2}.*");
        Matcher matcher1 = pattern.matcher("JAVA SE License");
        System.out.println(matcher1.matches());
        Matcher matcher2 = pattern.matcher("JAVA SE ");
        System.out.println(matcher2.matches());
        Matcher matcher3 = pattern.matcher("JAVA ee License");
        System.out.println(matcher3.matches());
        Matcher matcher4 = pattern.matcher("JAVA ms License");
        System.out.println(matcher4.matches());
        Matcher matcher5 = pattern.matcher("JAVA e");
        System.out.println(matcher5.matches());
        Matcher matcher6 = pattern.matcher("JAVA ab");
        System.out.println(matcher6.matches());
        Matcher matcher7 = pattern.matcher("JAVA ee");
        System.out.println(matcher7.matches());
    }

    @Test
    public void test4() {
        Pattern pattern = Pattern.compile("saw");
        Matcher matcher1 = pattern.matcher("I saw a saw");
        while (matcher1.find()) {
            System.out.println(matcher1.start() + "-" + (matcher1.end() - 1));
        }
    }

    @Test
    public void test5() {
        Pattern pattern = Pattern.compile("cake", Pattern.CASE_INSENSITIVE);
        String a = "nick cake ,I loving it cake";
        Matcher matcher = pattern.matcher(a);
        String all = matcher.replaceAll("coffee");
        System.out.println(all);
    }

    @Test
    public void test6() {
        String[] b, c, d;
        Pattern pattern = Pattern.compile("[:/.]+");
        String a = "https://google.com.tw";
        b = pattern.split(a);
        for (String s : b) {
            System.out.println(s);
        }
        c = pattern.split(a, 2);
        for (String s : c) {
            System.out.println(s);
        }
        d = pattern.split(a, 100);
        for (String s : d) {
            System.out.println(s);
        }
        String[] e = pattern.split(a, -1);
        for (String s : e) {
            System.out.println(s);
        }
    }

    @Test
    public void test7() {
        String[] b;
        String a = "https://google.com.tw";
        b = a.split("[:/.]+");
        for (String s : b) {
            System.out.println(s);
        }
    }

    @Test
    public void test8() {
        String a = "a1b2c3";
        String[] strings = a.split("\\d");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}