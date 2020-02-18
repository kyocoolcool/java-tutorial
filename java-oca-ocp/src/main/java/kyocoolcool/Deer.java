package kyocoolcool;

/**
 * @ClassName ExtendsTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019/11/11 11:26 PM
 * @Version 1.0
 **/

public class Deer {
    private Integer num;
    public Deer() {
        System.out.println("Dear");
    }

    public Deer(int age) {
        System.out.println(this.num);
        System.out.println("DearAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println(deer.hasHorns());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        super(1);
        System.out.println("Reindeer");
    }

    public Reindeer() {
        System.out.println("indeer");
    }

    public boolean hasHorns() {
        return true;
    }
}
