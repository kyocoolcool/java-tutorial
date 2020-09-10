package kyocoolcool.exam_v1475.exam154;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:04 AM
 **/
public class Test {
    public static void main(String[] args) {
        String a = "java";
        String b = "";
        String[] c = {"j", "a", "v", "a"};
        for (String s : c) {
            b += s;
        }

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
