package kyocoolcool.exam2.exam188;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/25 10:28 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int row = 10;
        for (; row > 0; ) {
            int cool = row;
            while (cool >= 0) {
                System.out.println(cool);
                cool -= 2;
            }
            row = row / cool;
        }
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("1111");

    }
}
