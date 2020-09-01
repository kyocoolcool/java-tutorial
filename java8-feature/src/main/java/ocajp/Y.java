package ocajp;

/**
 * @ClassName Y
 * 
 * @Author Chris Chen
 * @Date 2019-07-10 17:20
 * @Version 1.0
 **/


public class Y extends x {
    Y() {}

    private void two() {
        System.out.println("two");
        one();
    }

    public static void main(String[] args) {
        new Y().two();
    }
}

    class x{
    x(){}
    public void one() {
        System.out.println("one");
    }
}