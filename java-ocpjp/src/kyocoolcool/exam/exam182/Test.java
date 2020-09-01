package kyocoolcool.exam.exam182;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 08:32
 **/
public class Test {
    double fuelLevel;

    public Test(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void start() {
        assert fuelLevel > 0:"Terminating...";
        System.out.println("started");
    }

    public void stop() {
        System.out.println("stopped");
    }

    public static void main(String[] args) {
        final Test test = new Test(-1);
        test.start();
    }
}