package kyocoolcool.exam2.exam162;

import java.util.ArrayList;

/**
 * @ClassName Test
 * 
 * @Author Chris Chen
 * @Date 2020/2/24 3:16 PM
 * @Version 1.0
 **/

abstract class Animal {
}

interface Hunter {

}

class Cat extends Animal implements Hunter {

}

class Tiger extends Cat {
}

public class Test {
    public static void main(String[] args) {
        final ArrayList<Animal> tigers = new ArrayList<>();
        tigers.add(new Cat());
    }
}
