package kyocoolcool.exam_v1495.exam92;

/**
 * @ClassName Car
 * 
 * @Author Chris Chen
 * @Date 2020/2/17 5:38 PM
 * @Version 1.0
 **/

class Vehicle {
    int x;

    public Vehicle() {
        this(10);
    }

    public Vehicle(int x) {
        this.x = x;
    }
}

public class Car extends Vehicle{
    int y;

    public Car() {
        super(10);
    }

    public Car(int y) {
        super(y);
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x+":"+this.y;
    }

    public static void main(String[] args) {
        final Vehicle y = new Car(20);
        System.out.println(y);
    }
}
