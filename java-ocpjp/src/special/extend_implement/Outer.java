package special.extend_implement;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 10:05 AM
 **/
 interface OuterInterface {
    public void InnerMethod();

    public interface InnerMethod {
        public void InnerMethod();
    }

}

public class Outer implements OuterInterface.InnerMethod,OuterInterface{
    public void InnerMethod() {
        System.out.println(100);
    }

    public static void main(String[] args) {
        final Outer outer = new Outer();
        outer.InnerMethod();
    }
}
