package kyocoolcool;

/**
 * @ClassName InterfaceTestImplment
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/11 4:10 PM
 * @Version 1.0
 **/

public class InterfaceTestImplment implements InterfaceTest {
    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void hello2() {
        System.out.println("hello2");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        final InterfaceTestImplment interfaceTestImplment = new InterfaceTestImplment();
        interfaceTestImplment.eat();
        interfaceTestImplment.hello();
        interfaceTestImplment.hello2();
    }
}