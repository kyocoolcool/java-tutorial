package kyocoolcool.exam_v1495.exam103;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 10:44 AM
 **/
class FuelNotAvailException extends Exception { }
class Vehicle {
    void ride() throws FuelNotAvailException {//line n1
        System.out.println("Happy Journey!");
    }}
class SolarVehicle extends Vehicle {
    public void ride () throws FuelNotAvailException {//line n2
        super.ride ();
    }}

public class Test {
    public static void main(String[] args) throws Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}
