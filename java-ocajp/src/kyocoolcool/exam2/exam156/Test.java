package kyocoolcool.exam2.exam156;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 2:56 PM
 * @Version 1.0
 **/
class Caller {
    private void init() {
        System.out.println("init");
    }

    private void start() {
        init();
        System.out.println("start");
    }
}

public class Test {
    public static void main(String[] args) {
        final Caller caller = new Caller();
//        caller.init();
//        caller.start();
    }
}
