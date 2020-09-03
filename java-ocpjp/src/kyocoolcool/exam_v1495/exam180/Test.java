package kyocoolcool.exam_v1495.exam180;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 07:04
 **/

interface P {
    public void method1();
}

interface Q extends P {
    public void method1();
}

interface R extends P{
    public void method2();
}

interface S {
  default   public void method(){};
}

interface T {
    public void method1();
    public void method2();
}

interface U {
    public void method1();
    public abstract void method2();
}

public class Test {
    public static void main(String[] args) {
        P p= ()-> System.out.println("hello");
        p.method1();
    }
}