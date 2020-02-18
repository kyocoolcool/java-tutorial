package kyocoolcool.exam.exam55;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/17 10:52 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String e = "";
        String c = "1";
        String d = "1";
        System.out.println(a == b);
        System.out.println(c == d);
        String[] ar = {"j", "a", "v", "a"};
        for (String s : ar) {
            e += s;
        }

        System.out.println(a == e);
        System.out.println(a.equals(e));

    }
}
