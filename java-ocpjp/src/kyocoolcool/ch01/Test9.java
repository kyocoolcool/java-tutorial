package kyocoolcool.ch01;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/10 11:41 PM
 **/

public class Test9 {
    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Test9.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        x++;
        return x;
    }

    public static void main(String[] args) {
        final int x = new Test9().getX();
        System.out.println(x);
    }
}
