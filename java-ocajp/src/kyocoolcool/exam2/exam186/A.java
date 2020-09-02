package kyocoolcool.exam2.exam186;

/**
 * @ClassName A
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 5:22 PM
 * @Version 1.0
 **/


public class A extends B {
    static int [] xx ;
    private String name;

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        final B a = new A();
        final B b = new B();
        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
}
