package kyocoolcool.exam_v1475.exam139;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 10:12 AM
 **/
class FuelNotAvailException extends Exception {
}

class Vehicle {
    void ride() throws Exception {//line n1
        System.out.println("Happy Journey!");
    }
}

class SolarVehicle extends Vehicle {
    public void ride() throws Exception {//line n2
        super.ride();
    }

    public static void main(String[] args) throws Exception, FuelNotAvailException {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}
