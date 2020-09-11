package kyocoolcool.exam_v1475.exam194;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 2:56 PM
 **/
interface Rideable {
    Car haveCar(String name,Integer age);
}

class Car {
    private String name;
    private Integer age;

    public Car(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Rideable rider = Car :: new;
        Car vehicle = rider.haveCar("MyCar",15);
        System.out.println(vehicle);
    }
}
