package ocajp.API;

/**
 * @ClassName Int
 * 
 * @Author Chris Chen
 * @Date 2019-06-20 18:24
 * @Version 1.0
 **/

public class Int {
    public static void main(String[] args) {
        String a = "100";
        String b = "300";
        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);
        System.out.println(a + b);
        System.out.println(i + j);
        Double aDouble = 10.0d;
        System.out.println(aDouble);
        Integer x = 5;
        Integer x2 = 10;
        int i1 = x.intValue();
        int i2 = x2;
        System.out.println(i1);
        System.out.println(i2);
    }
}