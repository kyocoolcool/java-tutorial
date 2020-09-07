package kyocoolcool.exam_v1475.exam39;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/7 3:28 PM
 **/
class Vehicle {
    int type;
    int speed;

    public Vehicle(int type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public Vehicle() {
    }
}
public class Test extends Vehicle{
    int age;
//    public Test(int age) {
//        this.age = age;
//    }


    public Test(int age) {
        this.age = age;
    }

    public Test(int type, int speed, int age) {
//        super();
        this(1);
        super.speed = speed;
//        super(type, speed);
//        this.age = age;
    }

    public static void main(String[] args) {
        final Test test = new Test(100,200,300);
        System.out.println(test.speed);
        System.out.println(test.age);

    }

}
