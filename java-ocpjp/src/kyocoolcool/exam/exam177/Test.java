package kyocoolcool.exam.exam177;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 04:31
 **/
public interface Test {
    Car getCar(String name);

    static class Car {
        public String name;

        public Car(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Test rider = Car :: new;
        Car vehicle = rider.getCar("MyCar");
        System.out.println(vehicle.name);
//        final Function<String, Car> test = Car::new;
//        final Car hello = test.apply("hello");
//        final Test test = Car::new;
//        final Car good = test.getCar("good");
//        System.out.println(good.name);
//        System.out.println(hello.name);

//        Car vehicle = rider.getCar("MyCar");
//        System.out.println(vehicle.getClass());
    }
}