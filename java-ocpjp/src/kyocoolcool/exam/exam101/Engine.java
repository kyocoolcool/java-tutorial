package kyocoolcool.exam.exam101;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 10:32 AM
 **/
public class Engine extends EngineOperator{
    Operator m = new EngineOperator();

    public void operator() {
        m.turnOn();
        m.turnOff();
    }
}
