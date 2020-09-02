package kyocoolcool.exam.exam104;

/**
 * @ClassName Car
 * 
 * @Author Chris Chen
 * @Date 2020/2/19 10:33 AM
 * @Version 1.0
 **/

class Vehicle {
    String type = "4w";
    int maxSpeed = 100;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle() {
    }
}

public class Car extends Vehicle{
    String trans;

    public Car(String trans) {
        this.trans = trans;
    }

    Car(String type,int maxSpeed,String trans) {
        super(type,maxSpeed);
//        this(trans);
    }
}
