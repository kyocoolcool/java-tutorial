package kyocoolcool.exam_v1495.exam62;

import java.io.IOException;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 10:41 AM
 **/
class FuelNotAvailException extends IOException {

}

class Vehicle {
    protected void ride() throws FuelNotAvailException, IOException, Exception {
        System.out.println("Happy Journey");
    }
}

class SolarVehicle extends Vehicle {
    public void ride() throws Exception {
//        try {
        super.ride();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}

public class Test {

    public static void main(String[] args) throws FuelNotAvailException, Exception {
        final Vehicle vehicle = new SolarVehicle();
        vehicle.ride();
        final Test stringTest = new Test();
        stringTest.hi("Good");
    }

    public <T> void hi(T t)  {
        T x=t;
        System.out.println(x);
    }

}
