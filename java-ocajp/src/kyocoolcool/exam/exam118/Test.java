package kyocoolcool.exam.exam118;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/20 2:35 PM
 * @Version 1.0
 **/

public class Test {
    private static int i;
    private Test() {

    }
}

abstract class A3 {
    private static int i;
    public void dostuff(){}
    protected A3(){}
}

final class A1 {
    public A1() {

    }
}

class A4 {
    protected static final int i = 0;
    private void dostuff() {

    }
}

abstract class A5 {
    protected static int i;

    void doStuff() {

    }

    abstract void doit();
}


