package kyocoolcool;

/**
 * @ClassName Plane
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/29 5:35 PM
 * @Version 1.0
 **/

public class Plane {
    //    public void fly(int i) {
//        System.out.print("int ");
//    }
    byte a = 1;

    public void fly(long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(2);
//        p.fly(123L);
    }
}
