package kyocoolcool.exam_v1495.exam46;

import java.io.IOException;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/12 11:38 AM
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        final A a = new A();
        try {
            a.init();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        a.hell0(20);


    }
}

class A{
    private int a;
    private int b;
    public void init() throws IOException {
        throw new IOException();
    }

    public void hell0(int a) {
        this.a = a;
        good(this.a);
    }

    public void good(int b) {
        this.b = b;

        System.out.println(this.a+"   "+this.b);
    }
}
