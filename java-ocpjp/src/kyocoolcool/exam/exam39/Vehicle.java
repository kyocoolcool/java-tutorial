package kyocoolcool.exam.exam39;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 3:07 PM
 **/
public class Vehicle {
    int distance;//line n1

    Vehicle(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) {//line n2
        int timeTravel = time;//line n3
        class Car {
            int value = 0;

            public void speed() {
                value = distance / timeTravel;
                System.out.println("Velocity with new speed" + value + "kmph");
            }
        }
        new Car().speed();
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle (100);
        v.increSpeed(60);
    }
}

