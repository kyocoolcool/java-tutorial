package kyocoolcool.exam.exam101;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 10:31 AM
 **/
public class EngineOperator extends Operator{
    @Override
    public final void turnOn() {
        System.out.println("turn on");
    }

    @Override
    public final void turnOff() {
        System.out.println("turn off");
    }
}
