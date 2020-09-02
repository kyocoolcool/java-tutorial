package kyocoolcool.exam2.exam143;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 2:12 PM
 * @Version 1.0
 **/

public class Test {
    static String a="abcdefghijk";


    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder("1234567890");
        System.out.println(stringBuilder.substring(3,5));
        stringBuilder.insert(3, a);
        System.out.println(stringBuilder.toString());
    }
}
