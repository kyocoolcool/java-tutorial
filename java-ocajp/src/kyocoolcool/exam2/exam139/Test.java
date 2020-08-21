package kyocoolcool.exam2.exam139;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 1:55 PM
 * @Version 1.0
 **/
class A {
    int num;

    public A(int num) {
        this.num = num;
    }
}

public class Test extends A{
    int aaa;

    public Test(int aaa,int bbb) {
        super(bbb);
        this.aaa = aaa;
    }

    public static void main(String[] args) {
        final Test test = new Test(10,29);
    }
}
