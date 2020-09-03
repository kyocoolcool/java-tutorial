package kyocoolcool.exam_v1495.exam98;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/19 10:08 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final Boolean[] booleans = new Boolean[2];
        booleans[0] = new Boolean(Boolean.parseBoolean("true"));
        booleans[1] = new Boolean(null);
        System.out.println(booleans[0]+"---------"+booleans[1]);

        String a = "abc";
        System.out.println(a.equals(null));
    }
}
