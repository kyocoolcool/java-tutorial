package special.extend_implement;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/26 10:10 AM
 **/
public class CC extends EE{

//    @Override
//    public void hello() {
//        System.out.println("CCC");
//    }

//    @Override
//    public void hello(String a) {
//        System.out.println(a);
//    }
//
//    @Override
//    public void good() {
//        System.out.println("ZZZ");
//    }

    public static void main(String[] args) {
        final CC cc = new CC();
        cc.hello();
//        cc.hello("good");
    }
}
