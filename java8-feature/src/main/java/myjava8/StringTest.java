package myjava8;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-27 14:45
 * @Version 1.0
 **/

public class StringTest {
    public static void main(String[] args) {
        String a = "abcdefg";
        String substring1 = a.substring(0, 1);
        String substring2 = a.substring(2);
        String s = a.replace('b', 'z');
        System.out.println(substring1+"*"+substring2);
    }
}