package kyocoolcool.ch07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className DeadLockTest
 * @description
 * @date 2020/7/31 5:18 PM
 **/
class Food {
}

class Water {
}

public class DeadLockTest {
    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println("Got Food!");
            move();
//            synchronized (water) {
                System.out.println("Got Water!");
//            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println("Got Water!");
            move();
            synchronized (food) {
                System.out.println("Got Food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
// Handle exception
        }
    }

    public static void main(String[] args) {
// Create participants and resources
        DeadLockTest foxy = new DeadLockTest();
        DeadLockTest tails = new DeadLockTest();
        Food food = new Food();
        Water water = new Water();
// Process data
        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
