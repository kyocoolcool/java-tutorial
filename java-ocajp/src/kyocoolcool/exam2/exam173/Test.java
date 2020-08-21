package kyocoolcool.exam2.exam173;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 3:42 PM
 * @Version 1.0
 **/

public class Test {
    int x;
    int y;

    public void sum(int x,int y) {
        x = x;
        y = this.y;
    }

    public void display() {
        System.out.println("x:" + x + "-----y:" + y);
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.x = 100;
        test.y = 200;
        final Test test2 = new Test();
        test2.sum(test.x, test.y);
        test.display();
        test2.display();
    }
}
