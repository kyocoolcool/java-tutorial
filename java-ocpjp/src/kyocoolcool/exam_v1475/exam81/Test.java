package kyocoolcool.exam_v1475.exam81;

import java.util.function.Supplier;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/9 2:05 PM
 **/
class Bird {
    public void fly() {
        System.out.println("Can fly");
    }
}

class Penguin extends Bird {
    public void fly() {
        System.out.println("Cannot fly");
    }
}

public class Test {
    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin ::new);
    }

    private static void fly(Supplier<Bird> bird) {
        bird.get().fly();
    }
}


