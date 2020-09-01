package kyocoolcool;

/**
 * @ClassName X
 *
 * @Author Chris Chen
 * @Date 2019/11/28 6:14 PM
 * @Version 1.0
 **/

public class X {
     int age=10;

    public X() {
        System.out.println("heyhey");
    }

    public void say() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        final X xxx = new X();
//        xxx.hey();
        System.out.println(xxx.age);
    }

}