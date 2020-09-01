package kyocoolcool.genericTest;

/**
 * @ClassName GenericExtendsTest
 *
 * @Author Chris Chen
 * @Date 2019-08-07 10:04
 * @Version 1.0
 **/

public class GenericExtendsTest<T> {


    public static void main(String[] args) {
        Monkey<Animal> m1 = new Monkey<Animal>();
        Monkey<Rabbit> m2 = new Monkey<Rabbit>();
        m1.hello(new Animal());
        m1.hello(new Rabbit());
        System.out.println("--------");
//        m2.hello((Rabbit) new Animal()); 無法編譯
        m2.hello( new Rabbit());

    }
}
class Animal<T>{
    private String name = "animal";

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Monkey<T extends Animal> {
    void hello(T t) {
        System.out.println(t);
    }
}

class Rabbit extends Animal {
    private String name = "rabbit";

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Sunny {

}


