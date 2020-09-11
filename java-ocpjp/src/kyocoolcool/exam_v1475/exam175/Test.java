package kyocoolcool.exam_v1475.exam175;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 1:50 PM
 **/

interface Z {
    public String toString();
}

class X implements Z {
    @Override
    public String toString() {
        return "X";
    }
}

class Y extends X {
    @Override
    public String toString() {
        return "Y";
    }
}
public class Test {
    public static void main(String[] args) {
        Y myY = new Y();
        X myX = myY;
        Z myZ = myX;
        System.out.println(myX);
        System.out.println((Y)myX);
        System.out.println(myZ);
    }
}
