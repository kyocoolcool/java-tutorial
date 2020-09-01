package myjava8;

/**
 * @ClassName Car
 * 
 * @Author Chris Chen
 * @Date 2019-05-09 11:26
 * @Version 1.0
 **/

public class Car {
    private static String name="Toyota";
    public void say() {
        System.out.println(name+": nice name");
    }
    public static void say2() {
        System.out.println(name+": nice name static");
    }

    public static void main(String[] args) {
        Car.say2();
    }
}