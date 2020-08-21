package kyocoolcool.exam2.exam36;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/21 4:29 PM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        int number[] ;
        number = new int[2];
        number[0] = 10;
        number[1] = 20;
        number = new int[4];
        number[2]=30;
        number[3]=40;

        for (int x : number) {
            System.out.println(" "+x);
        }

    }
}
