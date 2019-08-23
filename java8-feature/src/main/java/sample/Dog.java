package sample;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-07-24 15:01
 * @Version 1.0
 **/

public class Dog extends Animal{
    @Override
    public void jump() {
        System.out.println("Dog Jump");
    }


    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.jump();
        animal.hello();
    }
}