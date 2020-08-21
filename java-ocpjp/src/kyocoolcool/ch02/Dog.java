package kyocoolcool.ch02;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Dog
 * @description
 * @date 2020/6/22 11:31 AM
 **/

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void good(Dog dog, Play play) {
        final boolean hi = play.hi(dog);
        System.out.println(hi);
    }

    public static void main(String[] args) {
        good(new Dog("tina"), a -> {
            if (a.name.equals("tina"))
                return true;
            else return false;
        });
    }
}
