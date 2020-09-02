package kyocoolcool.exam2.exam151;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/24 2:39 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String str1 = "Java";
        String[] strArr = {"J", "a", "v", "a"};
        String str3 = "";
        for (String s : strArr) {
            str3 += s;
        }
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);
        System.out.println(b1);
        System.out.println(b2);
    }
}
