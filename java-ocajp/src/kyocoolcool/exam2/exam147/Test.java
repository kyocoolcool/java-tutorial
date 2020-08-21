package kyocoolcool.exam2.exam147;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris Chen
 * @Date 2020/2/24 2:22 PM
 * @Version 1.0
 **/

class Vehicle {
    int x;

    public Vehicle() {
        this(10);
    }

    public Vehicle(int x) {
        this.x = x;
    }
}

public class Test extends Vehicle{
    int y;

     Test() {
        super(10);
    }

    Test(int y) {
         super(y);
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        final Vehicle test = new Test(20);
        System.out.println(test);
    }
}
