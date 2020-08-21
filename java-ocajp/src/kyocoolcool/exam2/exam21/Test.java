package kyocoolcool.exam2.exam21;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/21 3:30 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("122222");
        System.out.println(stringBuffer);

        stringBuffer.delete(0, stringBuffer.length());

        System.out.println(stringBuffer);
        System.out.println("-------");
    }
}
