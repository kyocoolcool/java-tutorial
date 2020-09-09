package kyocoolcool.exam_v1475.exam95;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 5:01 PM
 **/

class PP {
    static int PP = 100;
    int PPP = 300;
}
public class QQ extends PP{
    static int PP = 200;
    int PPP = 400;
    public static Integer age;
    public static void main(String[] args) {
        final PP qq = new QQ();
        System.out.println(qq.PPP);
    }
}
