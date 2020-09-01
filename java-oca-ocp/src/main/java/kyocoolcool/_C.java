package kyocoolcool;

/**
 * @ClassName DDD
 * 
 * @Author Chris Chen
 * @Date 2019/11/11 9:50 PM
 * @Version 1.0
 **/

public class _C {
    public static short a_b;
    public static int $;

    public static void main(String[] args) {
//        System.out.println(a_b);
//        System.out.println($);
        int x = 1;
        int y = 2;
//        int z = x < 3 ? ++x : y++;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        String[] strings = new String[3];
//        for (String s : strings) {
//            System.out.println(s);
//        }
        byte a=1;
        byte b = 2;
        long i1 = (byte) (a + b);
        System.out.println(x==1?x==1:false);
        out:
        if (x == 1) {
           inner: for (int i = 0; i < 5; i++) {
                if(i==3){
                    continue inner;
                }
                System.out.println(i);
            }
        }
    }
}