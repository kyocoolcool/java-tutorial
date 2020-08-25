package kyocoolcool.exam.exam42;

import java.util.function.Supplier;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 4:51 PM
 **/
public class Bird {
    public static void fly() {
        System.out.print("Can fly");
    }

    public static void fly(Supplier<Bird> bird) {
        bird.get();
        fly();
    }

    static class Penguin extends Bird {
        public Penguin() {

        }
        public static void fly(Supplier<Bird> bird) {
            bird.get();
            fly();
        }

        public static void fly() {
            System.out.print("Cannot fly");
        }
    }
}
