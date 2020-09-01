package kyocoolcool;

/**
 * @ClassName Bunny
 *
 * @Author Chris Chen
 * @Date 2019/11/29 6:12 PM
 * @Version 1.0
 **/

public class Bunny {
    private String color;
    private int height;
    private int length;

    public Bunny(int length, int theHeight) {
        length = this.length; // backwards – no good!
        height = theHeight; // fine because a different name
        this.color = "white"; // fine, but redundant
    }

    public static void main(String[] args) {
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
        Rabbit4 rabbit4 = new Rabbit4(1);
    }
}

class Rabbit4 {
    private Rabbit4() {
    }

    Rabbit4(int a) {
    }

    public void hello() {
        Rabbit4 rabbit4 = new Rabbit4();
    }
}