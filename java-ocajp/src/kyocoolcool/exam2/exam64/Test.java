package kyocoolcool.exam2.exam64;

/**
 * @ClassName Test
 *
 * @Author Chris Chen
 * @Date 2020/2/21 6:02 PM
 * @Version 1.0
 **/

class V {
    String type = "4W";
    int maxSpeed = 100;

    public V(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public V() {
    }
}
public class Test extends V{
    String trans;

    public Test(String trans) {
        this.trans = trans;
    }

    public Test(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this.trans = trans;
    }

    public static void main(String[] args) {
        final Test test1 = new Test("Auto");
        final Test test2 = new Test("4w", 150, "ttt");
        System.out.println(test1.type+" "+test1.maxSpeed+" "+test1.trans);
        System.out.println(test2.type+" "+test2.maxSpeed+" "+test2.trans);

    }
}
